package com.akhilexpress.json_java_databinding.json_java_databinding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 
 Ctrl+1 : Find return type 
  */


public class App 
{
    public static void main( String[] args ) throws StreamReadException, DatabindException, IOException
    {
      ObjectMapper objectMapper=new ObjectMapper();
     //Used for indentation/break
      objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
      //Student student = objectMapper.readValue(new File("C:\\Users\\Amiseq\\Selenium_Express\\json-java-databinding\\src\\main\\resources\\student.json"),Student.class);
      Student student = objectMapper.readValue(new File("data\\student.json"),Student.class);
      
		/*
		 * Student student = objectMapper.readValue("{\r\n" +
		 * "\"name\" : \"Akhilesh\",\r\n" + "\"address\": \"Morena\"\r\n" +
		 * "}",Student.class);
		 */
      System.out.println(student);
      
      Student student2=new Student();
      student2.setName("Rahul");
      student2.setAddress("Indore");
      
      
      //User of JSON ignore properties 
      objectMapper.writeValue(new File("data\\my_student.json"), student2);
      
      
      Student student3 = objectMapper.readValue(new File("data\\my_student2.json"), Student.class);
      System.out.println(student3);
      
      /*POJO can have extra variables but if there are extra variable(other then presnetin POJO) in json and json ignire properties
      are not used with POJO then it will throw exception  "Unrecognized field".
      */
    }
}
