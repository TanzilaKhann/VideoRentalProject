import java.util.*;
public class VideoLauncher extends VideoStore{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore v=new VideoStore();
		int no;
		boolean x=true;
		String name;
		while(x){
			
System.out.println("Main menu");
System.out.println("==========\n");
System.out.println("1.Add Videos:");
System.out.println("2. Check out Video:");
System.out.println("3. Return Video:");
System.out.println("4. Receive Rating:");
System.out.println("5. List Inventory:");
System.out.println("6. Exit:");
System.out.print("Enter your choice (1...6) ");
no=sc.nextInt();

switch (no){
case 1:
System.out.print("Enter the name of the video you want to add: ");
name=sc.next();
v.addVideo(name);

break;
case 2:
	System.out.print("Enter the name of the video you want to check out: ");
	name=sc.next();

	v.doCheckout(name);

	break;
case 3:
	System.out.print("Enter the name of the video you want to return: ");
	name=sc.next();
	
	v.doReturn(name);
	
	break;
case 4:
	System.out.print("Enter the name of the video you want to Rate: ");
	name=sc.next();

	System.out.println("Enter the rating for this video: ");
	int i=sc.nextInt();
	
	v.receiveRating(name, i);

	break;
case 5:
	v.listInventory();
   break;
case 6:
	x=false;
	sc.close();
	System.out.println("Exiting...!! Thanks for using  the application");
	break;
	default:
		System.out.println("Enter correct number");
		break;
}
		}
	}

}
