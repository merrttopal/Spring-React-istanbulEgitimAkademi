package com.repositories;

import com.entities.IProduct;
import com.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByPid(Long pid, Pageable pageable);
    @Query(value = "select p.pTitle,p.pDetail,p.price, c.categories from category c inner join product p on c.cid = p.cid where c.cname = ?1 order by p.price asc limit ?2", nativeQuery = true)
    List<IProduct> getProductsBy(String cname, int limit);

    @Query(value = "select p.pTitle,p.pDetail,p.price, c.categories,pi.text,pi.pid from category c inner join product p on c.cid = p.cid inner join product_image pi on p.pid = pi.pid", nativeQuery = true)
    List<IProduct> getProductsAllBy();

    Optional<Product> findBypTitleEquals(String pTitle);
}