public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println(“Hello from John Doe!”);
	}
}


/**
 * Author:	Kevin Kelly
 * File:	HelloWorld.java
 * 
 * Description:
 * Print Hello to the console. 	
 */
 
public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println(“Hello from John Doe!”);
	}
}


/**
 * Author:	Kevin Kelly
 * File:	ElevatorCapacity.java
 * 
 * Description:
 * Determine elevator capacity. 	
 */
 
public class ElevatorCapacity 
{
    public static void main(String args[]) 
    {
        int weightOfPerson;
        int elevatorWeightLimit;
        int numOfPeople;

        weightOfPerson = 150;
        elevatorWeightLimit = 1400;
        numOfPeople = elevatorWeightLimit / weightOfPerson;

        System.out.print("You can fit ");
        System.out.print(numOfPeople);
        System.out.println(" people on the elevator.");
    }
}



/**
 * Author:	Kevin Kelly
 * File:	ElevatorCapacity.java
 * 
 * Description:
 * Determine elevator capacity with user input. 	
 */
import java.util.Scanner;
 
public class ElevatorCapacity 
{
    public static void main(String args[]) 
    {
        int weightOfPerson = 0;
        int elevatorWeightLimit = 1400;
        int numOfPeople = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the average weight per person: ");
		weightOfPerson = input.nextInt();

        numOfPeople = elevatorWeightLimit / weightOfPerson;

        System.out.print("You can fit ");
        System.out.print(numOfPeople);
        System.out.println(" people on the elevator.");
    }
}


/**
 * Author:	Kevin Kelly
 * File:	ElevatorCapacity.java
 * 
 * Description:
 * Determine elevator capacity with user input and named constant. 	
 */
import java.util.Scanner;
 
public class ElevatorCapacity 
{
    public static void main(String args[]) 
    {
		final int WEIGHT_LIMIT = 1400;
        
		int weightOfPerson = 0;
        int numOfPeople = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the average weight per person: ");
		weightOfPerson = input.nextInt();

        numOfPeople = WEIGHT_LIMIT / weightOfPerson;

        System.out.print("You can fit ");
        System.out.print(numOfPeople);
        System.out.println(" people on the elevator.");
    }
}

/**
 * Author:	Kevin Kelly
 * File:	DogeCalc.java
 * 
 * Description:
 * Determine amount of Dogecoin you can purchase. 
 */
import java.util.Scanner;
 
public class DogeCalc 
{
    public static void main(String args[]) 
    {
		final double DOGE_PRICE = 0.292822;
		double moneyToInvest = 0;
		double amountOfDoge = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of money to invest in DOGE: $");
		moneyToInvest = input.nextDouble();

        amountOfDoge = moneyToInvest / DOGE_PRICE;

        System.out.print("You can purchase ");
        System.out.print(amountOfDoge);
        System.out.println(" Doge coins.");
        
        System.out.printf("\n\nYou can purchase " + "%.2f" + " Doge coins.", amountOfDoge, "\n");
    }
}


/**
 * Author:	Kevin Kelly
 * File:	DogeCalc.java
 * 
 * Description:
 * Determine amount of Dogecoin you can purchase. Includes boolean logic, if/else.  
 */
import java.util.Scanner;
 
public class DogeCalc 
{
    public static void main(String args[]) 
    {
		final double DOGE_PRICE = 0.292822;
		double moneyToInvest = 0;
		double amountOfDoge = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of money to invest in DOGE: $");
		moneyToInvest = input.nextDouble();
		
		if (moneyToInvest < 100)
		{
			System.out.println("We do not recommend investing in DOGE");
		}
		else if (moneyToInvest >= 100 && moneyToInvest < 10000)
		{
			amountOfDoge = moneyToInvest / DOGE_PRICE;

			System.out.print("You can purchase ");
			System.out.print(amountOfDoge);
			System.out.println(" Doge coins.");
			
			System.out.printf("\n\nYou can purchase " + "%.2f" + " Doge coins.", amountOfDoge, "\n");
		}
		else
		{
			System.out.println("We do not recommend investing in DOGE");
		}


    }
}


