package com.codingshuttle.jpaTutorial.jpaTuts;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutsApplicationTests {
@Autowired
    ProductRepository productRepository;

    @Test
    void testProductRepository(){
        ProductEntity productEntity=ProductEntity.builder()
                .sku("nestle234")
                .title("Nestle Chocolate")
                .price(BigDecimal.valueOf(123.45))
                .quantity(12)
                .build();

        ProductEntity product=productRepository.save(productEntity);
        System.out.println(product);

    }

    @Test
    void getRepository(){
        List<ProductEntity> products= productRepository.findAll();
        System.out.println(products);
    }

    @Test
    void findByTitleTest(){
        List<ProductEntity> productsByTitle= productRepository.findByTitle("Pepsi");
        System.out.println(productsByTitle);
    }

    @Test
    void findProductsCreatedAfterCertainDate(){
        List<ProductEntity> products= productRepository.findByCreatedAtAfter(LocalDateTime.of(2024,1,1,0,0,0));
        System.out.println(products);
    }
    @Test
    void findByPriceAndQuantityTest(){
        List<ProductEntity> products= productRepository.findByPriceLessThanAndQuantityGreaterThan(BigDecimal.valueOf(23.45),2);
        System.out.println(products);
    }

    @Test
    void getProductByTitleOrPrice(){
        Optional<ProductEntity> product= productRepository.findByTitleAndPrice("Mazza",BigDecimal.valueOf(16.4));
        System.out.println(product);
    }
}
