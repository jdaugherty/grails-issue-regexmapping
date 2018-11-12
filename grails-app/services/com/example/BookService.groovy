package com.example

import grails.gorm.services.Service

@Service(Book)
abstract class BookService {

    abstract Book get(Serializable id)

    abstract List<Book> list(Map args)

    abstract Long count()

    abstract void delete(Serializable id)
}