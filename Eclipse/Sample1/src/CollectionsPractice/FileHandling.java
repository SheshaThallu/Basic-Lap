// Q. take text input from user, write it in a file and then read that file and display the content of the file in the console.
package CollectionsPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
	public static void main(String[] args) throws IOException 
	{
		File file1 = new File("C:\\Users\\shesha_thallu\\Task.txt");
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you like");
		String text = sc.nextLine();
		sc.close();
		try 
		{
			fos = new FileOutputStream(file1);
			fos.write(text.getBytes("UTF-8"));
			System.out.println("Done");
		} 
		catch (IOException e) 
		{
			System.out.println("Error occured");
		} 
		finally 
		{
			fos.close();
		}
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(file1);
			System.out.println("Size of file" + fis.available());
			int content;
			while ((content = fis.read()) != -1) 
			{
				System.out.print((char) content);
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error occured");
		} 
		finally 
		{
			fis.close();
		}
	}
}