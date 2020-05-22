package com.computacion9.clase8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.computacion9.clase7.User;

public class FileConvertion {

	public static void main(String[] args) {

		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/mock_data.csv");

		ArrayList<User> usuarios = new ArrayList<User>();
		
		try {
			usuarios = lectura(ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bidkar/Desktop/java_clase_file/mock_data.txt"));
			
			for (User u : usuarios) {
				writer.write(String.format("%-10d%-20s%-20s%-50s%-10s%-20s%n", u.getId(), u.getFirstname(), u.getLastname(),
						u.getEmail(), u.getGender(), u.getIpAddress()));
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("He terminado de crear el archivo.");
	}

	private static ArrayList<User> lectura(File ruta) throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			ArrayList<User> users = new ArrayList<User>();
			String linea = null;
			Scanner scanner = null;
			int lineNumber = 1;
			while ((linea = reader.readLine()) != null) {
				if (lineNumber > 1) {
					User u = new User();
					int index = 0;
					scanner = new Scanner(linea);
					scanner.useDelimiter(",");
					while (scanner.hasNext()) {
						String data = scanner.next();
						switch (index) {
						case 0:
							u.setId(Integer.parseInt(data));
							break;
						case 1:
							u.setFirstname(data);
							break;
						case 2:
							u.setLastname(data);
							break;
						case 3:
							u.setEmail(data);
							break;
						case 4:
							u.setGender(data);
							break;
						case 5:
							u.setIpAddress(data);
							break;
						}
						index++;
					}
					users.add(u);
				} else {
					lineNumber++;
				}
			}
			reader.close();
			return users;
		} catch (IOException e) {
			throw e;
		}
	}

}
