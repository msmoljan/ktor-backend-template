package com.example.main.domain.catalog

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class CatalogTests {

    private lateinit var catalog: Catalog

    @BeforeEach
    fun setUp() {
        val repository = CatalogMockRepository()

        catalog = Catalog(repository)
    }

    @Test
    @DisplayName("Assure that a book is in the catalog after being added to it")
    fun testBookIsViewableInCatalogAfterBeingStored() {
        // Given
        val book = Book(
            title = "Leviathan Wakes",
            author = "James S.A. Corey",
            isbn = Isbn("9781478998945")
        )

        // When
        catalog.add(book)
        val bookFromCatalog = catalog.find(book.isbn)

        // Then
        assertNotNull(bookFromCatalog)
        assertEquals(book, bookFromCatalog)
    }
}