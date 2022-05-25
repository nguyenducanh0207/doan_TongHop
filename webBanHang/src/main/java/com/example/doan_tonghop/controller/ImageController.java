package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.model.ImageDTO;
import com.example.doan_tonghop.service.impl.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;
    @PostMapping("upload")
    public ImageDTO uploadImage(@RequestParam("parentID") Long parentID,
                              @RequestParam("orderBy") Long orderBy,
                              @RequestParam("file")MultipartFile file,
                              @RequestParam("statusId") Long statusId,
                              @RequestParam("imageType") Long imageType)
    {
        ImageDTO imageDTO = new ImageDTO();
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        imageDTO.setImageUrl(filename);
        imageDTO.setParentId(parentID);
        imageDTO.setOrderBy(orderBy);
        imageDTO.setStatusId(statusId);
        imageDTO.setImageType(imageType);

        return imageService.save(imageDTO);
    }
}
