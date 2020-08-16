package project.selfefd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import project.selfefd.dto.UserDTO;
import project.selfefd.repository.UserRepository;

@Service
@EnableTransactionManagement
public class UserService {
	@Autowired
	UserRepository userRepository;

    public UserDTO saveUser(UserDTO user) {
    	
     user = new UserDTO();
        
        
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        
        return user;

        

    }
	
}
