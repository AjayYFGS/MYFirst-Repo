import java.util.Scanner;

public class Switchcases {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Command:-");
		String text=s.nextLine();
		switch(text) {
		case "start":
			System.out.println("machine has started");
			break;
		case "stop":
			System.out.println("machine has stoped");
		break;
			default:
				System.out.println("command isnot recognized");
		}

	}

}
