package project.selfefd.restcontroller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RestController;

import project.selfefd.dto.UserDTO;

@RestController
public class UserController {
	

    public ResponseEntity<UserDTO> getUserById(String id) {
    	
    	UserDTO user = new UserDTO();
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.accepted().headers(headers).body(user);

        

    }
    
    public ResponseEntity<UserDTO> save(UserDTO user) {
    	
    	
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.accepted().headers(headers).body(user);

        

    }
    
    public ResponseEntity<UserDTO> update(UserDTO user) {
    	
    	
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.accepted().headers(headers).body(user);

        

    }
    
    public BodyBuilder delete(UserDTO user) {
    	
    	
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.status(HttpStatus.CREATED);

        

    }
	
}
