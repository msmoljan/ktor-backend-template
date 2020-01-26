package com.example.main.domain.catalog

internal class Catalog(private val catalogRepository: CatalogRepository) {
    fun add(book: Book) {
        catalogRepository.put(book)
    }

    fun find(isbn: Isbn): Book? {
        return catalogRepository.find(isbn)
    }
}