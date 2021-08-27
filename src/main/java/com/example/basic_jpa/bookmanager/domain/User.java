package com.example.basic_jpa.bookmanager.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString(exclude = {"createdAt","updatedAt"})
@Setter
@Getter
public class User {
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
