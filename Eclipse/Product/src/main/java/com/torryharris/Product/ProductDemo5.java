package com.torryharris.Product;

import java.util.Scanner;

public class ProductDemo5 
{
	public static void main(String[] args) 
	{
		ProductDAO pd=new ProductDAO();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product Code: ");
		int prod_code=sc.nextInt();
		System.out.print("Enter Product Name: ");
		String prod_name=sc.next();
		System.out.print("Enter Product Price: ");
		int prod_price=sc.nextInt();
		System.out.print("Enter Product Category:");
		String prod_catg=sc.next();
		Products p=new Products(prod_code, prod_name, prod_price, prod_catg);
		if(pd.insertProduct(p))
			System.out.println("Inseted Column Successfully.");
		else
			System.out.println("Failed to Insert.");
		System.out.print("Enter Product Code: ");
		prod_code=sc.nextInt();
		p=pd.getProduct(prod_code);
		System.out.println("Product Details:");
		System.out.println("Product Code : "+p.getProd_code()+"\nProduct Name : "+p.getProd_name()+"\nProduct Price : "+p.getProd_price()+"\nProduct Category : "+p.getProd_catg());
		sc.close();
	}
}
