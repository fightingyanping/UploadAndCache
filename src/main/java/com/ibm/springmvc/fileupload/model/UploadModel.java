package com.ibm.springmvc.fileupload.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
@ToString
public class UploadModel {
    
    private String extraField;
    
    private MultipartFile[] files;
}
