# Kotlin Backend Template

Use this template for new Kotlin backend projects. 

## Structure

- `:application` 
- `:main`
    - `:domain`
    - `:data`

### Clean architecture

### Example code: Book Store

**Features:**
- Catalog
    - Add books to catalog
    - Remove books from catalog
    - Browse catalog
    - Get details of a book from the catalog 
        - Also show if the book is available in the inventory
- Inventory 
    - Add item to inventory
    - Remove item from inventory
    - Check inventory availability for item
- Sales
    - Sell article(s)
    - Get info for all purchases of a single article
    - Get info for all articles of a single purchase 
    - Total sales report (earnings)
 

### Multi-module