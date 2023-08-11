package com.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;


    @Email
    @NotBlank
    @NotEmpty
    @NotNull
    private String email;


    @NotBlank
    @NotEmpty
    @NotNull
    private String password;

    @ManyToMany
    private List<Role> role;

}
