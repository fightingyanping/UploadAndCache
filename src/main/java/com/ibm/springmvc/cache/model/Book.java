package com.ibm.springmvc.cache.model;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book implements Serializable {
    private String isbn;
    private String title;
}
