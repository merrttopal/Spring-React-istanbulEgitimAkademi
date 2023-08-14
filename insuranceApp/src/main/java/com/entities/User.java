package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "USER_TABLE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Email
    @NotBlank
    @NotNull
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank
    @NotNull
    private String password;

    @ManyToOne
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;

    @ManyToMany
    private List<Role> role;
}
