package com.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

import java.util.List;

@Data
@Entity
@Table(name = "ORDER_TABLE") // Tablo adını "ORDER_TABLE" olarak değiştirdik
public class OrderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    @OneToMany
    @JoinColumn(name = "user_id") // Veritabanında user tablosuna referans oluşturuldu
    private List<User> users;

    @OneToMany
    @JoinColumn(name = "ud_id") // Veritabanında user_detail tablosuna referans oluşturuldu
    private List<UserDetail> userDetail;

    @NotNull
    @Range(min = 0, max = 3)
    private Integer status;
}
