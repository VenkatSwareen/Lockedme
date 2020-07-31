
import java.util.Scanner;
public class Lockedme {
	public void  User()
	{
		int g;
		FileOperations f=new FileOperations();
		do {
		System.out.println("enter 1 to view files\nenter 2 for fileoperations\nenter 3 to close the application");
		Scanner scan=new Scanner(System.in);
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			f.Display();
			break;
		case 2:
			System.out.println("enter 1 to add file\nenter 2 to delete file\nenter 3 to search file");
			int c=scan.nextInt();
			switch(c)
			{
			case 1:
			f.addFiles();
			break;
		case 2:
				f.deleteFile();
				break;
			case 3:
				f.searchFile();
				break;
			default:System.out.println("invalid input");
			}
			break;
		case 3:System.out.println("application closed");
		System.exit(0);
			default:System.out.println("invalid input");
		}
		System.out.println("enter '1' for main menu");
		g=scan.nextInt();
		}while(g==1);
	}
	public static void main(String[] args) {
	System.out.println("\n\t\t\tWELCOME TO LOCKEDME\n\t\t\tDEVELOPED BY DXC TECHNOLOGY\n");
    Lockedme obj=new Lockedme();
    obj.User();
	}

}
