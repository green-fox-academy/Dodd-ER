package com.zmesza.toread.service;

import com.zmesza.toread.model.Book;
import com.zmesza.toread.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

  private BookRepository repository;

  @Autowired
  public BookServiceImpl(BookRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Book> getUnReadBooks() {
    List<Book> originalBookList = new ArrayList<>();
    this.repository.findAll().forEach(originalBookList :: add);
    return originalBookList.stream()
        .filter(Book -> !Book.isFinished())
        .collect(Collectors.toList());
  }

  @Override
  public List<Book> getAllBooks() {
    List<Book> originalBookList = new ArrayList<>();
    this.repository.findAll().forEach(originalBookList :: add);
    return originalBookList;
  }

  @Override
  public void saveNewBook(Book book) {
    this.repository.save(book);
  }

  @Override
  public void deleteBookById(int id) {
    this.repository.deleteById(id);
  }

  @Override
  public Book getBookById(int id) {
    return this.repository.findById(id).orElse(null);
  }

  @Override
  public void editBookById(int id) {
    //this.repository.findById(id).get().setFinished(true);
  }
}
