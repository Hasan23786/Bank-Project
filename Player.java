package game_project;
import java.util.Scanner;
public class Player {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char p;
		do {
			System.out.println("======Game is started======== ");
			Weapon w=g.pressButton();
			w.use();
			System.out.println("Press Y/y to continue");
			p=sc.next().charAt(0);
		}while(p=='Y' || p=='y');
		System.out.println("thank you for playing the game have a good day");
	}

}
