package de.gre90r.jsfdemo.model;

import java.util.Objects;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="book")
@SessionScoped
public class Book implements Comparable<Book> {

	private int id;
	private String name;
	private String author;
	
	public Book() {
		super();
	}

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public Book(Book book) {
		this(book.getId(), book.getName(), book.getAuthor());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int compareTo(Book other) {
		return this.getId() - other.getId();
	}
	
}
