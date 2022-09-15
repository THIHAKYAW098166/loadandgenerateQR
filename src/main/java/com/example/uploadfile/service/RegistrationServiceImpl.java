package com.example.uploadfile.service;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.uploadfile.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	  @Autowired
	    private FileService fileService;

	    @Override
	    public void registerUser(UserDTO userDTO) {
	        //TODO Add code to store user basic details like name, address etc

	        // 2L should be replaced by dynamic user id which will be generated after storing user details
	        fileService.saveFile(userDTO.getAddressProof().getFile(),getFilePath("D:\\New folder (2)",
	                userDTO.getAddressProof().getDocumentType(),2L));
	    }

	    private Path getFilePath(String basePath,String documentType,Long userId){
	        Path path= Paths.get(basePath);
	        return path.resolve(String.valueOf(userId)).resolve(documentType);
	    }
	}
