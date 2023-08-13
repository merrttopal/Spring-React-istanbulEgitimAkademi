package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "USER_DETAIL")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ud_id") // Fiziksel sütun adını belirttik
    private Long udId;

    @Email
    @NotBlank
    @Column(nullable = false) // Veritabanında nullable olmamalı
    private String email;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false)
    private String surname;

    @NotNull
    @Column(nullable = false)
    private Integer age;

    @NotBlank
    @Column(nullable = false)
    private String phoneNumber;
}
