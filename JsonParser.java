package com.spring.project1;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class JsonParser {

	    public static List<Student> parseJSOn(String url) throws ParseException {
	        List<Student> studentList = new ArrayList<>();
	        List<Course> courseList = new ArrayList<>();
	        
	        Client client = Client.create();
	        WebResource webResource = client.resource(url);

	        ClientResponse clientResponse = webResource.accept("application/json").get(ClientResponse.class);
	        if (clientResponse.getStatus() != 200) {
	            throw new RuntimeException("Failed"+ clientResponse.toString());
	        }

	        JSONArray jsonArray = (JSONArray) new  JSONParser().parse(clientResponse.getEntity(String.class));

	        Iterator<Object> it = jsonArray.iterator();

	        int id;
	        String firstName;
	        String gender;
	        String email;
	        String course_no;
	        String grade;
	        int credit_hours;
	        Course course;
	        while (it.hasNext()){
	            JSONObject jsonObject = (JSONObject)it.next();
	            id = (int)jsonObject.get("id");
	            firstName = (String)jsonObject.get("first_name");
	            gender = (String)jsonObject.get("gender");
	            email = (String)jsonObject.get("email");
	            course_no = (String)jsonObject.get("course_no");
	            grade = (String)jsonObject.get("grade");
	            credit_hours = (int)jsonObject.get("credit_hours");
	            course = (Course)jsonObject.get("course");
	            
	            studentList.add(new Student(id, firstName,gender,email, course ));
	            courseList.add(new Course(course_no,grade,credit_hours));
	        }

	        return studentList;
	    }
	    public  void search(String first_name, String course_no ) throws  ParseException{
	    	System.out.println("Search by name: "+first_name+" and course_no.:"+course_no);
	    	List<Student> studentList = parseJSOn("https://hccs-advancejava.s3.amazonaws.com/student_course.json");
	    	for ( Student student: studentList) {
	    		if( student.getFirst_name().equalsIgnoreCase(first_name) & student.getCourse().getCourse_no().equalsIgnoreCase(course_no)){
	    			 System.out.println("found student "+student);
	    	}
	    		else {
	    			System.out.println("Student not found.");
	    		}
	    	}
	    	
	    }

	  
	    }
	    




