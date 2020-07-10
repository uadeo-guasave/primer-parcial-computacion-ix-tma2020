package com.computacion9.parcial3;

public class Book {
	private int id;
	private String title;
	private int authorId;
	private int categoryId;
	private String isbn;
	private int editorialId;
	private String volume;
	private int pages;
	private int editionYear;
	

	public Book(int id, String title, int authorId, int categoryId, String isbn, int editorialId, String volume,
			int pages, int editionYear) {
		super();
		this.id = id;
		this.title = title;
		this.authorId = authorId;
		this.categoryId = categoryId;
		this.isbn = isbn;
		this.editorialId = editorialId;
		this.volume = volume;
		this.pages = pages;
		this.editionYear = editionYear;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authorId=" + authorId + ", categoryId=" + categoryId
				+ ", isbn=" + isbn + ", editorialId=" + editorialId + ", volume=" + volume + ", pages=" + pages
				+ ", editionYear=" + editionYear + "]";
	}

	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getAuthorId() {
		return authorId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getEditorialId() {
		return editorialId;
	}
	public String getVolume() {
		return volume;
	}
	public int getPages() {
		return pages;
	}
	public int getEditionYear() {
		return editionYear;
	}
}
