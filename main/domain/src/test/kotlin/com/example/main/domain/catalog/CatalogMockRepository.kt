package com.example.main.domain.catalog

class CatalogMockRepository : CatalogRepository {

    private val books = mutableMapOf<Isbn, Book>()

    override fun put(book: Book) {
        books[book.isbn] = book
    }

    override fun find(isbn: Isbn): Book? {
        return books[isbn]
    }
}