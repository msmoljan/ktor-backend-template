package com.example.main.domain.catalog

interface CatalogRepository {
    fun put(book: Book)
    fun find(isbn: Isbn): Book?
}
