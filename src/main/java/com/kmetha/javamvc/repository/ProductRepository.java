package com.kmetha.javamvc.repository;

import com.kmetha.javamvc.model.Product;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProductRepository {

    List<Product> products = new ArrayList<>();

    private int countProducts = 0;

    public Product save(Product product) {
        product.setId(countProducts++);
        products.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }

//    public Optional<Product> findById(Integer id) {
//        if (id < products.size()) {
//            return Optional.of(products.get(id));
//        } else {
//            return Optional.empty();
//        }
//    }

    public Product findById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public void deleteById(Integer id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
