package edu.aws.product.rest

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, String> {
    @Query("SELECT * FROM PRODUCTS")
    fun findAllProducts() : List<Product>
}