package de.gre90r.jsfdemo.service;

import java.util.List;

import de.gre90r.jsfdemo.model.Book;

public interface BookService {

	public List<Book> getAllBooks();
	public boolean add(Book book);
	
}
