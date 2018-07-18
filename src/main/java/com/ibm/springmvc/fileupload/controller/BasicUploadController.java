package com.ibm.springmvc.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件上传控制器
 * Ref:
 * @see <a>http://www.mkyong.com/spring-boot/spring-boot-file-upload-example/</a>
 */
@Controller
public class BasicUploadController extends BaseController{
    
    @GetMapping("/basic")
    public String index() {
        return "basic/upload";
    }
    
    @PostMapping("/basic/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }
        
        try {
            
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            
            redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded '" + file.getOriginalFilename() + "'");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return "redirect:/basic/uploadStatus";
    }
    
    @GetMapping("/basic/uploadStatus")
    public String uploadStatus() {
        return "basic/uploadStatus";
    }
}
