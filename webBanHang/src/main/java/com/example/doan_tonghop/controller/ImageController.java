package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.model.ImageDTO;
import com.example.doan_tonghop.service.impl.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ImageController {
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

    @Autowired
    private ImageService imageService;
    @PostMapping("upload")
    public ImageDTO uploadImage(@RequestParam("file")MultipartFile image) throws IOException {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("image");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath).resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }
        {
            ImageDTO imageDTO = new ImageDTO();
            imageDTO.setImageUrl(imagePath.resolve(image.getOriginalFilename()).toString());

        }
    }
}
