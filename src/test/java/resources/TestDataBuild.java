package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.location;



public class TestDataBuild {
	
	public AddPlace addPlacePayLoad(String name, String language, String address) {
		
	AddPlace addPlace = new AddPlace();	//create object
	
	addPlace.setName(name);
	addPlace.setAccuracy("50");
	addPlace.setAddress(address);
	addPlace.setLanguage(language);
	addPlace.setPhone_number("8800112233");
	addPlace.setWebsite("www.gmail.com");
	
	List<String>myList = new ArrayList<String>();
	myList.add("shoe park");
	myList.add("shop");
	 
	addPlace.setTypes(myList);
	 
	location loc = new location();  // location obj
	loc.setLat(36);
	loc.setLng(35);
	addPlace.setLocation(loc);
	
	return addPlace;
	}
}
