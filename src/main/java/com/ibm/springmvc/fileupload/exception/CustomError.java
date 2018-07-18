package com.ibm.springmvc.fileupload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CustomError {
    private String code;
    private String message;
}
