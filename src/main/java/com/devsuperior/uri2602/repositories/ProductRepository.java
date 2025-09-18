package com.devsuperior.uri2602.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2602.dto.ProductDTO;
import com.devsuperior.uri2602.entities.Product;
import com.devsuperior.uri2602.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long>{

    @Query(nativeQuery = true, value = "SELECT id, name FROM public.products WHERE price< :p1 OR price> :p2")
    List<ProductMinProjection> search2604(Integer p1, Integer p2);

    @Query("SELECT new com.devsuperior.uri2602.dto.ProductDTO(obj.id, obj.name) FROM Product obj WHERE obj.price< :p1 OR obj.price> :p2")
    List<ProductDTO> search2604X(Integer p1, Integer p2);
}
