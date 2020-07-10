package com.computacion9.parcial3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class DemoSqlite {

	public static HashSet<Book> libros = new HashSet<Book>();

	public static void main(String[] args) {

//		Connect();
		getAllBooks();

		for (Book libro : libros) {
			System.out.println(libro);
		}

	}

	private static Connection Connect() {
		Connection cnn = null;
		try {
			String url = "jdbc:sqlite:db/demo.sqlite";
			// create a connection to the database
			cnn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return cnn;
	}

	private static void getAllBooks() {
		String sql = "SELECT * FROM books";

		try (Connection conn = Connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
//				System.out.println("ID: " + rs.getInt("id") + ", Book Title: " + rs.getString("title"));
				Book libro = new Book(rs.getInt("id"), rs.getString("title"), rs.getInt("author_id"),
						rs.getInt("category_id"), rs.getString("isbn"), rs.getInt("editorial_id"),
						rs.getString("volume"), rs.getInt("pages"), rs.getInt("edition_year"));
				libros.add(libro);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
