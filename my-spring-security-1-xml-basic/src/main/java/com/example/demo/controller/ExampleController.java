package com.example.demo.controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

	@GetMapping("/")
	public String home() {
		return "redirect:basics";
	}

	@GetMapping("/basics")
	public String printWelcome(Model model, Principal principal, Authentication authentication) {
		model.addAttribute("title", "Spring Security Basic Example");
		model.addAttribute("principal", principal);

		@SuppressWarnings("unchecked")
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) authentication.getAuthorities();
		model.addAttribute("authorities", authorities);
		
		return "basics";
	}
}
