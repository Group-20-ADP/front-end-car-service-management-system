package za.ac.cput.frontendcarservicemanagement.client;
/**
 author: aphiwe skeyi 217157785
 */
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import org.json.*;
import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.Vehicle;
import za.ac.cput.frontendcarservicemanagement.factory.CustomerFactory;
import za.ac.cput.frontendcarservicemanagement.factory.VehicleFactory;

public class VehicleClient {
    public static MediaType JSON = MediaType.get("application/json; charset=utf-8");
    
    
     public static OkHttpClient createAuthenticatedClient(final String username,
                final String password) {
        // build client with authentication information.
        OkHttpClient httpClient = new OkHttpClient.Builder().authenticator((Route route, Response response) -> {
            String credential = Credentials.basic(username, password);
            return response.request().newBuilder().header("Authorization", credential).build();
        }).build();
        return httpClient;
    }

    public static Response doRequest(OkHttpClient httpClient, String anyURL) throws Exception {
        Request request = new Request.Builder().url(anyURL).build();
        Response response = httpClient.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        System.out.println(response.body().string());
        return response;
    }
    
   // private static final OkHttpClient client = createAuthenticatedClient("user","password");
    
                
    private static ArrayList<Vehicle> customerList = new ArrayList();
    
    //Create
    private static String runSave(String url)throws IOException{
        OkHttpClient client = createAuthenticatedClient("user","password");
        Request request = new Request.Builder() 
                .url(url)   
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
     
    public String post(String url, String json) throws IOException{
        OkHttpClient client = createAuthenticatedClient("user","password");
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }   
    
    public void saveVehicle(String make, String model, String year, Customer customer) {
        try{
            final String url = "http://localhost:8088/vehicle/create";
            Vehicle vehicle = VehicleFactory.createVehicle(make, model, year, 1);
            Gson g = new Gson();
            String jsonString = g.toJson(vehicle);
            String r = post(url, jsonString);
            if(r!=null){
                JOptionPane.showMessageDialog(null, "Saved Successfully");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Read
    public static ArrayList<Vehicle> getAll(){
        try{
            customerList.removeAll(customerList);
            final String url = "http://localhost:8088/vehicle/getAll";
            String responseBody = runSave(url);
            
            JSONArray customers = new JSONArray(responseBody);
            for(int i = 0; i < customers.length(); i++){
                JSONObject customer = customers.getJSONObject(i);
                Gson g = new Gson();
                //Finally Convert from JSON to Java Object
                Vehicle w = g.fromJson(customer.toString(), Vehicle.class);
                customerList.add(w);
            }
            System.out.println(customerList.toString());
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
       return customerList;
    }
    
    //Delete
     public static String runDelete(String url, long key) throws IOException {
         OkHttpClient client = createAuthenticatedClient("user","password");
         Gson g = new Gson();
         String jsonString = g.toJson(key);
          RequestBody body = RequestBody
                .create(JSON, jsonString);
        Request request = new Request.Builder().url(url+key).delete(body).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    
    public static void deleteVehicle(long key) throws IOException{
        String response = "";
        response = runDelete("http://localhost:8088/vehicle/delete/",key);
        System.out.println(response);
    }
    
    public static void main(String[] args) {
        long key = 2;
        try {
            deleteVehicle(key);
        } catch (Exception ex) {
            Logger.getLogger(VehicleClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}   
