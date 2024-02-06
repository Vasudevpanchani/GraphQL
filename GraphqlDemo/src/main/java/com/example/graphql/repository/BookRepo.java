package com.example.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.graphql.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
