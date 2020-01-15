package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product date: ");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Products product = new Products(name,price,quantity);
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of the products to be added from stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of the products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: "+ product);
		
		
		sc.close();
	}

}
