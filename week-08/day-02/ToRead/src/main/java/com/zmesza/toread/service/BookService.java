package com.zmesza.toread.service;

import com.zmesza.toread.model.Book;
import java.util.List;

public interface BookService {

  List<Book> getUnReadBooks();
  List<Book> getAllBooks();
  void saveNewBook(Book book);
  void deleteBookById(int id);
  Book getBookById(int id);
  void editBookById(int id);
}
