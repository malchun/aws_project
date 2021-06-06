package edu.aws.product.rest

import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository) {

    fun findProducts() : List<Product> {
        return productRepository.findAllProducts()
    }

    fun saveProduct(product: Product) {
        productRepository.save(product)
    }
}