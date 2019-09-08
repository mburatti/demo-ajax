package com.mburatti.demoajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mburatti.demoajax.domain.SocialMetaTag;
import com.mburatti.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}
	
	@Autowired 
	SocialMetaTagService service;
	
	@Override
	public void run(String... args) throws Exception{
		SocialMetaTag og = service.getSocialMetaTagByUrl("https://www.udemy.com/course/python-3-do-zero-ao-avancado/");
		System.out.println(og.toString());
		
		SocialMetaTag twitter = service.getSocialMetaTagByUrl("https://www.pichau.com.br/gabinete-pichau-gaming-komor-led-rgb-lateal-em-vidro-temp-pgk-01-rgb");
		System.out.println(twitter.toString());
	}

}
