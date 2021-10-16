package de.gre90r.jsfdemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import de.gre90r.jsfdemo.model.Book;
import de.gre90r.jsfdemo.service.BookService;

@ManagedBean(name="bookService")
@ApplicationScoped
public class BookServiceImpl implements BookService {

	private final List<Book> books = new ArrayList<>();
	private final Random random = new Random();
	
	@Override
	public boolean add(Book book) {
		book.setId(random.nextInt());
		return this.books.add(new Book(book));
	}

	@Override
	public List<Book> getAllBooks() {
		return this.books;
	}

	public List<Book> getBooks() {
		return books;
	}
	

}
