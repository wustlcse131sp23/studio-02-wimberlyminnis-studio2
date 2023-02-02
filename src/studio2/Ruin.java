package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Starting amount: ");
		int inputAmount = in.nextInt();
		
		System.out.print("Win probability: ");
		double winChance = in.nextDouble();
		
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Total Simulations: ");
		int totalSim = in.nextInt();
		
		for (int day = 1; day <= totalSim; day++)
		{
			int ruinLimit = 0;
			
			int Simulation = 0;
			int startAmount = inputAmount;
			
			while (startAmount > ruinLimit && startAmount < winLimit)
			{	Simulation = Simulation + 1;
				double gamble = Math.random();
				boolean result = (winChance > gamble);
				if (result == true)
				{
					startAmount = startAmount + 1;
				}
					else 
					{
						startAmount = startAmount - 1;
						
					}
				
		}
			if (startAmount == winLimit)
			{
		System.out.println("Simulation" + day + ":" + Simulation + " WIN");
			}
			else
			{
		System.out.println("Simulation" + day + ":" + Simulation + " LOSE");
		}
		
		
		
		
		}
	}
}

