package com.tushar.RestContr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {
	
	private static final Logger log = LoggerFactory.getLogger(WelcomeApi.class);

	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		log.info("Inside welcome API");
		log.info("Excute Logic");
		return new ResponseEntity<String>("Jay Shri Ram ",HttpStatus.OK);
		
	}

}
