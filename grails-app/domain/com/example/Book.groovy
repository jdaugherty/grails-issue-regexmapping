package com.example

class Book {
    String name
    String id

    static belongsTo = [author: Author]

    static constraints = {
        id(bindable: true)
    }

    static mapping = {
        id(generator: 'assigned')
    }
}
