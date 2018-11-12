package com.example

class Author {
    String name

    static hasMany = [ books: Book]
    static belongsTo = [ publisher: Publisher ]
}
