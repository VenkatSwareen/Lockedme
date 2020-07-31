import java.io.*;
import java.util.Scanner;
public class FileOperations {
	private File files=new File("C:\\lockedme");
	private File filenames[]=files.listFiles();
	Scanner scan=new Scanner(System.in);
	public void Display(){
	System.out.println("files in the directory");
	for(File filename:filenames) {
		System.out.println(filename);
       }
     }
	public void addFiles()
	{
		System.out.println("enter file name");
		files=new File("C:\\lockedme\\"+scan.next());
		try {
			if(files.exists())
			{
				System.out.println("file already exists");
			}
			else
			{
		files.createNewFile();
		System.out.println("file created");
			}
		}catch(Exception e)
		{
			System.out.println("file cannot be created");
		}

	}
	public void deleteFile()
	{
		System.out.println("enter file to deleted");
			files=new File("C:\\lockedme\\"+(scan.next()));
			if(files.exists())
			{
				files.delete();
				System.out.println("file deleted");
			}
			else {
				System.out.println("file not found");
			}
	}
	public void searchFile()
	{
		System.out.println("enter file name");
		files=new File("C:\\lockedme\\"+scan.next());
		if(files.exists())
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file do not exist");
			
			
		}
	}
	
}