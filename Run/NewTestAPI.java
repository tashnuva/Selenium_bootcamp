package Run;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.io.File;

public class NewTestAPI {
  /*@Test
  public void f() {
	 
	  
	          //how to response with get method
	           
	           
	  Response it= get("http://reqres.in/api/users?page=2");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
  }*/

  
  
            //how to use post method
  
  @Test
  public void f6() {
	  File ti=new File("C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Entry.json");
	  Response it=given().contentType(ContentType.JSON).body(ti).post("https://reqres.in/api/users");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
	  
	  
	  
	             //assert class
	  
	  int status=it.getStatusCode();
			  Assert.assertEquals(status, 201);
	  
  }
  
  
  
  

}




