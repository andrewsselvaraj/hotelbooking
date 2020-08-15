package project.selfefd.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/index")
public class IndexRestController {


	
	@GetMapping("/")
	public String index()
	{
		System.out.println("Inside index");
		return "index";
	}
	
	
}
