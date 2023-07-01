package com.works.entities;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    @Size(min = 2, max = 100)
    @NotEmpty
    @NotNull
    private String title;

    @Range(max = 2139999999)
    @Min(5)
    @Positive
    private Integer price;

    @NotNull
    @OneToOne
    @JoinColumn
    private Category category;

}
