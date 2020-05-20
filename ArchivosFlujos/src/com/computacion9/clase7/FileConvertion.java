package com.computacion9.clase7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileConvertion {

	public static void main(String[] args) {
		
		// TODO: realizar el código que guarde en un archivo nuevo .txt el resultado de la lectura

		File ruta = new File("/Users/bidkar/Desktop/java_clase_file/mock_data.csv");

		lectura(ruta);

	}

	private static void lectura(File ruta) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
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
//				10 20 20 50 10 20
					System.out.printf("%-10d%-20s%-20s%-50s%-10s%-20s%n", u.getId(), u.getFirstname(), u.getLastname(),
							u.getEmail(), u.getGender(), u.getIpAddress());
				} else {
					System.out.printf("%-10s%-20s%-20s%-50s%-10s%-20s%n", "id","first_name","last_name","email","gender","ip_address");
					lineNumber++;
				}
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
