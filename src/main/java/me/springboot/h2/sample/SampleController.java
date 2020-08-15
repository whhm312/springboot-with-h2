package me.springboot.h2.sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	SampleService userService;

	public SampleController(SampleService userService) {
		this.userService = userService;
	}

	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		User response = userService.getUser(userId);
		return response;
	}
}
