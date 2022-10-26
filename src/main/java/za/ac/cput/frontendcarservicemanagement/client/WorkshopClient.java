package za.ac.cput.frontendcarservicemanagement.client;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.frontendcarservicemanagement.entity.Workshop;
import za.ac.cput.frontendcarservicemanagement.factory.WorkshopFactory;


public class WorkshopClient {
    public static MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();
    private static ArrayList<Workshop> WorkshopList = new ArrayList();
    
    private static String run(String url)throws IOException{
        Request request = new Request.Builder() 
                .url(url)
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
    
    public void saveWorkshop(String name, String location) {
        try{
            final String url = "http://localhost:8088/workshop/create";
            Workshop workshop = WorkshopFactory.createWorkshop(name, location);
            Gson g = new Gson();
            String jsonString = g.toJson(workshop);
            String r = post(url, jsonString);
            if(r!=null){
                JOptionPane.showMessageDialog(null, "Saved Successfully");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String post(String url, String json) throws IOException{
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
    
    public static ArrayList<Workshop> getAll(){
        try{
            WorkshopList.removeAll(WorkshopList);
            final String url = "http://localhost:8088/workshop/getAll";
            String responseBody = run(url);
            
            JSONArray workshops = new JSONArray(responseBody);
            for(int i = 0; i < workshops.length(); i++){
                JSONObject workshop = workshops.getJSONObject(i);
                Gson g = new Gson();
                //Finally Convert from JSON to Java Object
                Workshop w = g.fromJson(workshop.toString(), Workshop.class);
                WorkshopList.add(w);
            }
            System.out.println(WorkshopList.toString());
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
       return WorkshopList;
    }
    
    public static void main(String[] args) {
        getAll();
    }
    
}
