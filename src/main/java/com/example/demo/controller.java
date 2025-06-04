package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class controller {
	@Autowired
	serviceimple serviceimple;
	
	@Value("${path}")
	String path;
	
	@PostMapping("/add")
	public String adddata(MultipartFile file) throws IOException {
		return serviceimple.uploadfile(file, path);
	}
	

}
