package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

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
    private String email;


    @Size(min = 6, max = 20)
    @NotBlank
    @NotEmpty
    @NotNull
    private String password;

    @ManyToMany
    private List<Role> role;

}
