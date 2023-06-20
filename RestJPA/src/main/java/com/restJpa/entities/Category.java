package com.restJpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Category {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long cid;
     private String catName;



}
