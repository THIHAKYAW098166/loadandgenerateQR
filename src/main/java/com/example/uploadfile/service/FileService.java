package com.example.uploadfile.service;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	 void saveFile(MultipartFile multipartFile, Path path);
}
