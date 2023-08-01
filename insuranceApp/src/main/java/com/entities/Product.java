package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    private String pTitle;

    private String pDetail;

    private Long price;

    @ManyToMany
    private List<Categories> categories;


}
