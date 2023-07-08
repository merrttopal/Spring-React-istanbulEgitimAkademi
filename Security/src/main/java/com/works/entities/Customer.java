package com.works.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(unique = true)
    @NotEmpty
    @NotNull
    private String email;

    private String password;

    @ManyToMany
    private List<Role> roles;

}
