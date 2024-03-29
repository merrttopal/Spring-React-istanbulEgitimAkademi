package com.restJpa.repositories;

import com.restJpa.entities.Product;
import com.restJpa.entities.projections.IProCat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select P.PID, P.TITLE, P.PRICE, C.CID, C.CAT_NAME from PUBLIC.PRODUCT as P\n" +
            "inner join PUBLIC.PRODUCT_CATEGORIES PC on P.PID = PC.PRODUCT_PID\n" +
            "inner join PUBLIC.CATEGORY as C on C.CID = PC.CATEGORIES_CID", nativeQuery = true)
    List<IProCat> proCatJoin();

    @Query(value = "select P.PID, P.TITLE, P.PRICE, C.CID, C.CAT_NAME from PUBLIC.PRODUCT as P\n" +
            "inner join PUBLIC.PRODUCT_CATEGORIES PC on P.PID = PC.PRODUCT_PID\n" +
            "inner join PUBLIC.CATEGORY as C on C.CID = PC.CATEGORIES_CID  where C.cid = ?1", nativeQuery = true)
    List<IProCat> proCatJoin(Long cid);

    @Query(value = "select P.PID, P.TITLE, P.PRICE, C.CID, C.CAT_NAME from PUBLIC.PRODUCT as P\n" +
            "inner join PUBLIC.PRODUCT_CATEGORIES PC on P.PID = PC.PRODUCT_PID\n" +
            "inner join PUBLIC.CATEGORY as C on C.CID = PC.CATEGORIES_CID  where C.cid = ?1", nativeQuery = true)
    Page<IProCat> proCatJoinPage(Long cid, Pageable pageable);
}