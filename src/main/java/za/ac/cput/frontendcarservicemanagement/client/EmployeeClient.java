/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.frontendcarservicemanagement.client;

/**
 *
 * @author AmyrH
 */


import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.frontendcarservicemanagement.entity.Customer;
import za.ac.cput.frontendcarservicemanagement.entity.Employee;
import za.ac.cput.frontendcarservicemanagement.factory.CustomerFactory;


/**
 *
 * @author AmyrH
 */


public class EmployeeClient {
    public static MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();
    private static ArrayList<Employee> employeeList = new ArrayList();
    
    private static String run(String url)throws IOException{
        Request request = new Request.Builder() 
                .url(url)
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
    
    public void saveCustomer(String name, String lastName, String email, String address) {
        try{
            final String url = "http://localhost:8088/customer/create";
            Customer customer = CustomerFactory.createCustomer(name, lastName, email, address);
            Gson g = new Gson();
            String jsonString = g.toJson(customer);
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
    
    public static ArrayList<Employee> getAll(){
        try{
            employeeList.removeAll(employeeList);
            final String url = "http://localhost:8088/customer/getAll";
            String responseBody = run(url);
            
            JSONArray employees = new JSONArray(responseBody);
            for(int i = 0; i < employees.length(); i++){
                JSONObject employer = employees.getJSONObject(i);
                Gson g = new Gson();
                //Finally Convert from JSON to Java Object
                Employee w = g.fromJson(employer.toString(), Employee.class);
                employeeList.add(w);
            }
            System.out.println(employeeList.toString());
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
       return employeeList;
    }
    
    public static void main(String[] args) {
        getAll();
    }}
    

