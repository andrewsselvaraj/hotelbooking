package project.selfefd.restcontroller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import project.selfefd.dto.UserDTO;

@RestController
public class LoginController {
	

    public ResponseEntity<UserDTO> getUserInfobyLogin() {
    	
    	UserDTO user = new UserDTO();
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.accepted().headers(headers).body(user);

        

    }
    
    public ResponseEntity<UserDTO> Logout() {
    	
    	UserDTO user = new UserDTO();
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return ResponseEntity.accepted().headers(headers).body(user);

        

    }
	
}
