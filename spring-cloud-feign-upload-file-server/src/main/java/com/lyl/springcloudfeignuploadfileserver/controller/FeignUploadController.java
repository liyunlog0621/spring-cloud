package com.lyl.springcloudfeignuploadfileserver.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName FeignUploadController
 * Author liyunlong
 * Data 上午 11:26
 * Version 1.0
 **/
@RestController
public class FeignUploadController {


    @PostMapping(value = "/uploadFile/server", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUploadServer(MultipartFile file) throws Exception {
        return file.getOriginalFilename();
    }
}
