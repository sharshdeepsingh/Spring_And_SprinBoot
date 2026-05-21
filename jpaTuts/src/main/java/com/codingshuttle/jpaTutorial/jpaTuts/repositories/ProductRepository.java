package com.codingshuttle.jpaTutorial.jpaTuts.repositories;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    // sorting and pagination
    List<ProductEntity> findByOrderByTitle();
List<ProductEntity> findByOrderByPrice();
// so in order to prevent createing methods for all the different fields we make use of the sort
List<ProductEntity> findBy(Sort sort);


// pgination and sorting together
    List<ProductEntity> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    // jpa and jpql lecture 3.4
    List<ProductEntity> findByTitle(String cocaCola);
    List<ProductEntity> findByCreatedAtAfter(LocalDateTime time);
    List<ProductEntity> findByPriceLessThanAndQuantityGreaterThan(BigDecimal price,Integer quantity);
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);
}
