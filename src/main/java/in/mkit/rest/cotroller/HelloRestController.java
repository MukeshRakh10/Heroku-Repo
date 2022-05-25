package in.mkit.rest.cotroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping(value = "/get")
	public ResponseEntity<String> getData() {
		return new ResponseEntity<String>("Welcome To Swagger !!!",HttpStatus.OK);
	}
}
