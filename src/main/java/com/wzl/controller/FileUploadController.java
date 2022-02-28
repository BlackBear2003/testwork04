package com.wzl.controller;

import com.wzl.entity.FileDomain;
import com.wzl.service.Impl.ResourceServiceImpl;
import com.wzl.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileUploadController {

    @Autowired
    private ResourceServiceImpl resourceService;

    @RequestMapping("/getFileUpload")
    public String getFileUpload() {
        return "fileUpload";
    }
    /**
     * 单文件上传
     */
    @RequestMapping("/fileupload")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request,int book_id) {
        /*

         */
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        String fileName = fileDomain.getMyfile().getOriginalFilename();
        File targetFile = new File(realpath, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        // 上传
        try {
            fileDomain.getMyfile().transferTo(targetFile);
            resourceService.addResource(book_id,fileName);

            System.out.println("success!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "showFile";
    }

}
