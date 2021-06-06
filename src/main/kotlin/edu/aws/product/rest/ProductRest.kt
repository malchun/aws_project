package edu.aws.product.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductRest(val productService: ProductService) {

    @GetMapping("product/2")
    fun get(): List<Product> {
        return productService.findProducts()
    }

    @PutMapping("product/2/add")
    fun add(@RequestBody product: Product) {
        productService.saveProduct(product)
    }
}