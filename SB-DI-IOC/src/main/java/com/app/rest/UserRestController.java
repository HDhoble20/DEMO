package com.app.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.RequestUserRestDetails;
import com.app.model.UserRest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	Map<String,UserRest> user;
	
	@GetMapping("/users/{id}")
	public UserRest getUser(@PathVariable("id") String id)
	{
		UserRest userRest = new UserRest();
		userRest.setUserId(id);
		userRest.setFirstName("Rahul");
		userRest.setLastName("Pawar");
		userRest.setEmail("rahul@gmail.com");
		
		return userRest;
	}
	
	
	/*@GetMapping(path = "/users/{id}",produces = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public UserRest getUser(@PathVariable("id") String id)
	{
		UserRest userRest = new UserRest();
		userRest.setUserId(id);
		userRest.setFirstName("Rahul");
		userRest.setLastName("Pawar");
		userRest.setEmail("rahul@gmail.com");
		
		return userRest;
	}*/
	
	/*@PostMapping(path = "/users",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE
			},consumes = {})
	public UserRest createUser(@Valid @RequestBody RequestUserRestDetails userDetails)
	{
		UserRest userRest = new UserRest();
		userRest.setFirstName(userDetails.getFirstName());
		userRest.setLastName(userDetails.getLastName());
		userRest.setEmail(userDetails.getEmail());
		String uid = UUID.randomUUID().toString();
		userRest.setUserId(uid);
		return userRest;
	}*/
	
	@PostMapping(path = "/users",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE
	},consumes = {})
public ResponseEntity<UserRest> createUser(@Valid @RequestBody RequestUserRestDetails userDetails)
{
UserRest userRest = new UserRest();
userRest.setFirstName(userDetails.getFirstName());
userRest.setLastName(userDetails.getLastName());
userRest.setEmail(userDetails.getEmail());
String uid = UUID.randomUUID().toString();
userRest.setUserId(uid);

	if(user == null)
	{
	user = new HashMap<String, UserRest>();
	}
	
	user.put(uid, userRest);


	//return new ResponseEntity<UserRest>(HttpStatus.BAD_REQUEST);
	return new ResponseEntity<UserRest>(userRest, HttpStatus.CREATED);
}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<UserRest> updateUser(@PathVariable("id") String id,@RequestBody RequestUserRestDetails requestUserRestDetails) 
	{
		UserRest userRest = user.get(id);
		if(userRest == null)
		{
			return new ResponseEntity<UserRest>(HttpStatus.NOT_FOUND);
		}
		else
		{
		userRest.setFirstName(requestUserRestDetails.getFirstName());
		userRest.setEmail(requestUserRestDetails.getEmail());
		user.put(id, userRest);
		
		return new ResponseEntity<UserRest>(userRest, HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") String id)
	{
		//UserRest userRest = user.get(id);
		user.remove(id);
		
		return new ResponseEntity<Void>(HttpStatus.GONE);
		
	}

}
