package com.talk2amareswaran.projects.socialloginapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SocialLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialLoginAppApplication.class, args);
	}
}
