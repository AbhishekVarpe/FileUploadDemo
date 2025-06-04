package com.example.demo;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface service
{
  String uploadfile(MultipartFile file,String path) throws IOException;
}
