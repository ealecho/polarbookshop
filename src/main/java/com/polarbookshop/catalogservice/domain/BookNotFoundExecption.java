package com.polarbookshop.catalogservice.domain;

public class BookNotFoundExecption extends RuntimeException {

  public BookNotFoundExecption(String isbn) {
    super("The book with ISBN" + isbn + "was not found");
  }
}
