/* Assignment 2 – Get Directory Details
Create a class FolderInfo with a static method printDirectory. 

printDirectory method should accept a folder path of type String as parameter. 
The method should print the contents of the passed folder as per below rules
•      If folder does not exist, print message “No Folder exists with the given name”
•      Details of every file in the given folder should be printed as below
o      File : <filename>
Absolute File path : <absolute path>
Folder Path : <path of file excluding the file name> 
•      Details of sub folder in the given folder should be printed as below
o      Directory : <sub folder name>
o      Path : <path of subfolder excluding the subfolder name>

Note: Only the files and subfolders in the given folder needs to be printed. 
Details of files and folders in sub folders need not be printed. */
package CollectionsPractice;

import java.io.File;

public class FolderInfo 
{
	static void printDirectory(File f) 
	{
		if(f.exists())
		{
			f.list();
		}
		else
			System.out.println("No Folder exists with the given name");
	}
	public static void main(String[] args) 
	{
	
	}
}
