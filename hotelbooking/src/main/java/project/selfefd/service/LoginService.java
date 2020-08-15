package project.selfefd.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import project.selfefd.dto.UserDTO;

@Service
public class LoginService {
	

    public UserDTO getUserInfobyLogin() {
    	
    	UserDTO user = new UserDTO();
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return user;

        

    }
	
}
