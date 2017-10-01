package com.theleakmark.product.services;

import com.theleakmark.product.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();
    Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProduct(Integer id);
}
