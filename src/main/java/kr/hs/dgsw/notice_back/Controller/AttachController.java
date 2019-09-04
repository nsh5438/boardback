package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Protocol.AttachmentPro;
import kr.hs.dgsw.notice_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@CrossOrigin(origins = "*")
public class AttachController {

    @Autowired
    UserService userService;

    @PostMapping("/upload/{userid}")
    public AttachmentPro upload(@RequestPart MultipartFile srcFile, @PathVariable Long userid){
        String destFilename
                    = "D:/3102_남가영/IdeaProjects/notice/notice_back/upload/"
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS_"))
                    + srcFile.getOriginalFilename();
        try {
            File destFile = new File(destFilename);
            destFile.getParentFile().mkdirs();
            srcFile.transferTo(destFile);
            return new AttachmentPro(userid, destFilename, srcFile.getOriginalFilename());
        }catch (Exception e){
            return null;
        }
    }


    @GetMapping("/download/{id}")
    public void download(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response){
        String filepath ;
        String filename;

        User user = this.userService.findById(id);
        filepath = user.getProfile_url();
        filename = user.getImagename();

        try{
            File file =new File(filepath);
            if(file.exists() == false) return;
            String fileType = URLConnection.guessContentTypeFromName(file.getName());
            if(fileType == null) fileType = "application/octet-stream";
            response.setContentType(fileType);
            response.setHeader("Content-Disposition", "inline; filename=\'" + filename + "\'");
            response.setContentLength((int)file.length());
            InputStream ip = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(ip,response.getOutputStream());
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
