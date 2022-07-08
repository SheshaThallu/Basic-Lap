/* Assignment 1 – Create Files and Directories
Create a class TestFile with a main method.

Do the Following
•      Create a folder named ‘Badminton’ in D or E drive based on system configuration
•      Create two files in the folder named “singles.txt” and “dubbles.txt”.
•      Create sub folder named “courts” in Badminton folder
•      Create a file named smash.dat in “courts” folder
•      Rename the dubbles.txt created earlier to doubles.txt
•      Delete the file singles.txt */
package CollectionsPractice;

import java.io.File;
import java.io.IOException;

public class TestFile 
{
	public static void main(String[] args) 
	{
		File f=new File("C:\\Users\\shesha_thallu\\Badminton");
		f.mkdir();
		String s1=f.getPath();
		File f1=new File(s1+"\\singles.txt");
		File f2=new File(s1+"\\dubbles.txt");
		try 
		{
			f1.createNewFile();
			f2.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		File ff=new File(s1+"\\courts");
		ff.mkdir();
		String s2=ff.getPath();
		File f3=new File(s2+"\\smash.dat");
		try 
		{
			f3.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		File f4=new File("C:\\Users\\shesha_thallu\\Badminton\\doubles.txt");
		f2.renameTo(f4);
		f1.delete();
	}
}
