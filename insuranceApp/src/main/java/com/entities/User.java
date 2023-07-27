package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;


    @Email
    @NotBlank
    @NotEmpty
    @NotNull
    private String mail;


    @Size(min = 6, max = 20)
    @NotBlank
    @NotEmpty
    @NotNull
    private String password;



}
