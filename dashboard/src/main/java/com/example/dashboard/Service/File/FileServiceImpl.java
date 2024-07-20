//package com.example.dashboard.Service.File;
//
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//public class FileServiceImpl implements FileService{
//    @Override
//    public String uploadFile(String path, MultipartFile file) throws IOException {
//        // get name of the file
//        String filename = file.getOriginalFilename();
//
//        // to get the file path
//        String filePath = path + File.separator + filename;
//
//        // create file object
//        File f = new File(path);
//        if (!f.exists()) {
//            f.mkdirs();
//        }
//
//        // copy the file or upload the file
//        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
//
//        return filename;
//    }
//
//    @Override
//    public InputStream getResourceFile(String path, String filename) throws Exception {
//        String filePath = path + File.separator + filename;
//
//        return new FileInputStream(filePath);
//    }
//
//
//}
