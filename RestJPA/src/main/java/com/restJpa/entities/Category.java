package com.restJpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Category  extends Base {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long cid;
     private String catName;

}
