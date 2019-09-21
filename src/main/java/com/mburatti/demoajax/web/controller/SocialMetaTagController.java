package com.mburatti.demoajax.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mburatti.demoajax.service.SocialMetaTagService;
import com.mburatti.demoajax.domain.SocialMetaTag;

@Controller
@RequestMapping("/meta")
public class SocialMetaTagController {
	@Autowired
	private SocialMetaTagService service;
	
	@PostMapping("/info")
	public ResponseEntity<SocialMetaTag> getDadosViaUrl(@RequestParam("url") String url){
		SocialMetaTag socialMetaTag = service.getSocialMetaTagByUrl(url);
		
		if (socialMetaTag != null)
			return ResponseEntity.ok(socialMetaTag);
		
		return ResponseEntity.notFound().build();
			
	}
	

	
}
