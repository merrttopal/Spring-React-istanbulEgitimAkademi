package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "USER_TABLE") // Tablo adını "USER_TABLE" olarak değiştirdik
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Email
    @NotBlank
    @NotNull
    @Column(unique = true, nullable = false) // Email alanını unique olarak ayarladık
    private String email;

    @NotBlank
    @NotNull
    private String password;

    @ManyToOne
    @JoinColumn(name = "user_detail_id") // Veritabanında user_detail tablosuna referans oluşturuldu
    private UserDetail userDetail;

    @ManyToMany
    private List<Role> role;
}
