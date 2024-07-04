package com.example.dashboard.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImp implements FileService{

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {

        return null;
    }

    @Override
    public InputStream getResourceFile(String path, String name) throws Exception {
        return null;
    }


}
