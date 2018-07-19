package com.ibm.springmvc.cache.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {
    private String isbn;
    private String title;
}
