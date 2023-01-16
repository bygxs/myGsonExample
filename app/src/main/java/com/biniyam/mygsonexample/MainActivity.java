package com.biniyam.mygsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();


        /*

        Employee employee= new Employee("Johna",30,"john@gmail.com");
        //now i turn this employee object (Johna) into a json format by passing it from gson toJson

        String json= gson.toJson(employee);
*/

        // now i am turning the json file to back to Gson unordered as is
       String json= "{\n" +
               "  \"age\": 30,\n" +
               "  \"firstName\": \"Johna\",\n" +
               "  \"mail\": \"john@gmail.com\"\n" +
               "}" ;
       Employee employee = gson.fromJson(json,Employee.class);
        // the same file is created in the debugger with all attributes from Json employee.json file

        // this how all seen and done copy from the debugger
    }
}