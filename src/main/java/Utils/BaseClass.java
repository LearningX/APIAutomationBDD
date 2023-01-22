package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	
	public static RequestSpecification req;
	public static Properties prop;

	
	
	public RequestSpecification requestSpecification() throws IOException { 
		if(req==null) {
		// create object of PrintSteam i.e. 
		// Run time pe file create kr rhe hai
		//Input of print stream is FileOutputStream, file type object
		//out stream for saving file , create file
		
		PrintStream log = new PrintStream( new FileOutputStream("logging.text"));

		// reqs builder is rest assured class which contains methods i.e. baseURI, authentication, path parameter or set cookies
		//for logging user addFiltere , return type is PrintStream
		
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		return req;
	} 
		return req;
	}
	public static String getGlobalValue(String key) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\saura\\eclipse-workspace\\ET_API_Test\\src\\main\\java\\Utils\\global.properties");
		prop.load(ip);
		return prop.getProperty(key);

	}
	public String getJsonPath(Response response, String key) {
		String resp = response.asString();	// convert response into string
		JsonPath js = new JsonPath(resp);	// pass the string into json path
		return js.get(key).toString();
	}


}
