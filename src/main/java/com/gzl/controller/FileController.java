package com.gzl.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/uploadFile")
    public String uploadFile(HttpServletRequest request) throws Exception {
        System.out.println("上传文件");
        String sPath = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(sPath);
        File f = new File(sPath);
        if (!f.exists()) {
            f.mkdir();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> Items = upload.parseRequest(request);
        for (FileItem item : Items) {
            if (item.isFormField()) {

            } else {
                String sName = item.getName();
                item.write(new File(sPath, sName));
                item.delete();
            }
        }

        return "success";
    }

    @RequestMapping("/uploadFile2")
    public String uploadFile2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("uploadFile2上传文件");

        String sPath = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(sPath);
        File f = new File(sPath);
        if (!f.exists()) {
            f.mkdir();
        }
        String sName = upload.getOriginalFilename();
        upload.transferTo(new File(sPath, sName));
        return "success";
    }
}
