package com.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SocialController {

	@GetMapping("/validate")
	public String validation()
	{
		return "Welcome to home.";
	}
	
	@GetMapping("/current-user-principal")
	public Principal currentUser(Principal principal)
	{
		return principal;
	}
	
	@GetMapping("/current-user-details")
	public Map<String,Object> authUser(@AuthenticationPrincipal OAuth2User user)
	{
		return user.getAttributes();
	}
}
