package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

import java.util.List;

@Data
@Entity
@Table(name = "ORDER_TABLE")
public class OrderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> users;

    @OneToMany
    @JoinColumn(name = "ud_id")
    private List<UserDetail> userDetail;

    @NotNull
    @Range(min = 0, max = 3)
    private Integer status;
}
