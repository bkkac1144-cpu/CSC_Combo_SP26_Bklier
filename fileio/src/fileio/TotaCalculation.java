package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotaCalculation {

	public static void main(String[] args) {
		double total = myFileReader("items.txt");
		double subtotal = total;
		double tax = .053;
		total = subtotal +(subtotal * tax);
		File myFile = myFileWriter("totals.txt");
		writeToFile(myFile, total, subtotal, tax);
	}
	public static File myFileWriter(String filename) {
		File file = null;
		 try {
			file = new File(filename);
			if (file.createNewFile()) {
				System.out.println("File created" + file.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		return file;

	}
	public static void writeToFile(File file, double total, double sub, double tax) {
		try (FileWriter myWriter = new FileWriter(file)) {
			String temp = String.format("The sub-total is $ %.2f\n", sub);
			myWriter.write(temp);
			temp = String.format("The tax is $ %.2f\n", tax);
			myWriter.write(temp);
			temp = String.format("The Total is $ %.2f\n", total);
			myWriter.write(temp);
			System.out.println("Write successful");
		} catch (IOException e) {
			System.out.println("Write failed");
			e.printStackTrace();
		}

	}
	public static double myFileReader(String filename) {
		File file = new File(filename);
		double total = 0;
		try (Scanner myReader = new Scanner(file)) {
			while(myReader.hasNextDouble()) {
				total += myReader.nextFloat();
				
				}
				
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		return total;
	}
}
