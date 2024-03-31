package com.gold.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gold.project.entity.Admin;
import com.gold.project.service.UserService;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
	  @Autowired
	    private UserService userService;

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestBody Admin admin) {
	        try {
	        	
	            boolean isAuthenticated = userService.authenticateUser(admin.getEmail(), admin.getPassword());

	            if (isAuthenticated) {
	            	//System.out.print(user);
	                return ResponseEntity.ok("ok");
	            } else {
	                return ResponseEntity.status(401).body("Login failed");
	            }
	        } catch (Exception e) {
	            e.printStackTrace(); // Log the exception for debugging
	            return ResponseEntity.status(500).body("Internal Server Error");
	        }
	    }
}


