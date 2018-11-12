package controllertransactions

import com.example.Author
import com.example.Book
import com.example.Publisher

class BootStrap {

    def init = { servletContext ->
        def publisher = new Publisher(name: 'The Publisher')

        def author1 = new Author(name: 'Some Author Name')
        publisher.addToAuthors(author1)
        author1.addToBooks(new Book(id: 'B$1', author: author1, name: 'The Great Book - Pt 1'))
        author1.addToBooks(new Book(id: 'B$2', author: author1, name: 'The Great Book - Pt 2'))
        author1.addToBooks(new Book(id: 'B$3', author: author1, name: 'The Great Book - Pt 3'))

        def author2 = new Author(name: 'Other Author Name')
        publisher.addToAuthors(author2)

        publisher.save(flush: true)
    }

    def destroy = {
    }
}
