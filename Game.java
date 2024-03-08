package game_project;
import java.util.Scanner;
public class Game {
	
	public   Weapon  pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Score: ");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("You got the Knife");
			
			return new Knife();
		}
		else if(score<=800)
		{
			System.out.println("Press 1 for Knife and 2 for Gun: ");
			int option=sc.nextInt();
			switch(option)
			{
			case 1: 
				System.out.println("You have selected Knife");
				return new Knife();
			case 2:
				System.out.println("You got the Gun");
				Gun g=new Gun();
				return g;
			default:
				System.out.println("Not a valid Option!!");
				return null;	
			}
			
		}
		else
		{
			System.out.println("You got the Bomb");
			Bomb b=new Bomb();
			return b;
		}
	}

}





