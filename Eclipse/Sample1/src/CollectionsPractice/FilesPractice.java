// Q. take text input from user, write it in a file and then read that file and display the content of the file in the console.
package CollectionsPractice;

import java.io.*;
import java.util.Scanner;

public class FilesPractice 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		File f=new File("C:\\Users\\shesha_thallu\\Task.txt");
		try 
		{
			FileOutputStream fos=new FileOutputStream(f);
			fos.write(s.getBytes());
			fos.close();
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		try 
		{
			FileInputStream fis=new FileInputStream(f);
			System.out.println("Size of file: "+fis.available());
			int content;
			File f2=new File("C:\\\\Users\\\\shesha_thallu\\\\Task1.txt");
			FileOutputStream fos=new FileOutputStream(f2);
			while((content = fis.read())!=-1)
			{
				System.out.print((char)content);
				fos.write((char)content);
			}
			fis.close();
			fos.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}

