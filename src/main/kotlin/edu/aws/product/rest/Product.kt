package edu.aws.product.rest

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("PRODUCTS")
data class Product(@Id val id: String?, val description: String)