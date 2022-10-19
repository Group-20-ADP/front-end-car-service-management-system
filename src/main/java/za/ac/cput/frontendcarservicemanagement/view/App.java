/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.frontendcarservicemanagement.view;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.*;
import okhttp3.*;
import org.json.*;
import za.ac.cput.frontendcarservicemanagement.entity.Workshop;

/**
 *
 * @author Kurtney Clyde Jantjies (218138105)
 * @group: Second Year
 */
public class App {
    private static OkHttpClient client = new OkHttpClient();
    
    private static String run(String url)throws IOException{
        Request request = new Request.Builder() 
                .url(url)
                .build();
        try(Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }
    
    
    private static List<Workshop> workshopList = new ArrayList();
    public static void getAll(){
        try{
            final String url = "http://localhost:8088/workshop/getAll";
            String responseBody = run(url);
            
            
            JSONArray workshops = new JSONArray(responseBody);
            for(int i = 0; i < workshops.length(); i++){
                JSONObject workshop = workshops.getJSONObject(i);
                Gson g = new Gson();
                //Finally Convert from JSON to Java Object
                Workshop w = g.fromJson(workshop.toString(), Workshop.class);
                workshopList.add(w);
            }
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
    
    public static void main(String[] args) {
        //Test Purposes
        getAll();
    }
    
    

}
