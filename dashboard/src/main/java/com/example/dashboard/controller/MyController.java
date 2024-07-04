package com.example.dashboard.controller;

import java.io.IOException;
import java.io.InputStream;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.dashboard.service.FileService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
public class MyController {

    @Value("${project.poster}")
    private String path;

    private final FileService fileService;

    @Autowired
    public MyController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFileHandler(@RequestPart MultipartFile file) throws IOException {
        String uploadedFileName = fileService.uploadFile(path, file);
        return ResponseEntity.ok("File is successfully upload: " + uploadedFileName);
    }

    @GetMapping("/{fileName}")
    public void serveFileHandler(@PathVariable String fileName, HttpServletResponse response) throws Exception {
        InputStream resourceFile  = fileService.getResourceFile(path, fileName);
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(resourceFile, response.getOutputStream());

    }

}