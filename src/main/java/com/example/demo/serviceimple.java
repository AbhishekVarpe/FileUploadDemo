package com.example.demo;

import java.io.IOException;
//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class serviceimple  implements service
{

	@Override
	public String uploadfile(MultipartFile file, String path) throws IOException {
		// TODO Auto-generated method stub
		String filename=file.getOriginalFilename();
		String filepath= path+filename;
		
		Files.copy(file.getInputStream(), Paths.get(filename));
		
		return filename+"file upload suucesfully";
	}

}
