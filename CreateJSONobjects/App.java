package com.appsdeveloperblog.json.gsonexample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class App {

    public static void main(String[] args) {
        
        // Create new JSON Object
        JsonObject person = new JsonObject();
        person.addProperty("firstName", "Sergey");
        person.addProperty("lastName", "Kargopolov");

        System.out.println(person.toString());

        // Create Inner JSON Object 
        JsonObject address = new JsonObject();
        address.addProperty("country", "ru");
        address.addProperty("city", "Moscow");

        person.add("address", address);

        System.out.println(person.toString());

        // Create JSON Array 
        JsonArray languages = new JsonArray();
        languages.add("Russian");
        languages.add("English");
        languages.add("French");

        System.out.println(languages.toString());

        // Create JSON Array from String
        String jsonString = "{\"firstName\":\"Sergey\",\"lastName\":\"Kargopolov\"}";
        JsonParser jsonParser = new JsonParser();
        JsonObject objectFromString = jsonParser.parse(jsonString).getAsJsonObject();
 
        System.out.println(objectFromString.toString());
        
        // Convert JSON Array String into JSON Array 
        String jsonArrayString = "[\"Russian\",\"English\",\"French\"]";
        JsonArray arrayFromString = jsonParser.parse(jsonArrayString).getAsJsonArray();
        
        System.out.println(arrayFromString.toString());
        
        
        // Convert JSON Array String into Java Array List
         Gson googleJson = new Gson();
         ArrayList javaArrayListFromGSON = googleJson.fromJson(arrayFromString, ArrayList.class);
         
         System.out.println(javaArrayListFromGSON);
        

        //Convert Java Plain Object into JSON
        Person personPojo = new Person();
        personPojo.setFirstName("Sergey");
        personPojo.setLastName("Kargopolov");

        Gson gsonBuilder = new GsonBuilder().create();
        String jsonFromPojo = gsonBuilder.toJson(personPojo);
        
        System.out.println(jsonFromPojo);

        // Convert Java Map into JSON 
        Map personMap = new HashMap();
        personMap.put("firstName", "Sergey");
        personMap.put("lastName", "Kargopolov");
        String jsonFromJavaMap = gsonBuilder.toJson(personMap);
        
        System.out.println(jsonFromJavaMap);

        // Convert Java Array into JSON
        List languagesArrayList = new ArrayList();
        languagesArrayList.add("Russian");
        languagesArrayList.add("English");
        languagesArrayList.add("French");
        
        String jsonFromJavaArrayList = gsonBuilder.toJson(languagesArrayList);
        
        System.out.println(jsonFromJavaArrayList);
       
    }
}