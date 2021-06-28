package com.example.dbauthjwtdemo.model;

import lombok.Data;

@Data
public class UserDTO {

    private String username;
    private String password;
    private String role;

}
