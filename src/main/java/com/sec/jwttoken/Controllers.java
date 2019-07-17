package com.sec.jwttoken;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@RequestMapping("/api/public")
    public String getMessage() {
        return "Hello from public API controller";
    }
	
	@RequestMapping("/api/private")
    public String getPrivateMessage() {
        return "Hello from private API controller";
}
}
