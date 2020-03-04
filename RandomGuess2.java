// Filename: RandomGuess.java
// George 2/5/2020

import javax.swing.JOptionPane;

public class RandomGuess2
{
	public static void main(String[] args)
	{
		// variables and constants
		int userGuess;
		int comNumber;
		String msg;
		
		// input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please think of a number between 1 and 10."));
		
		// calculation phase
		comNumber = (1 + (int)(Math.random() * 10));
		
		if(userGuess == comNumber)
		{
			msg = "YOU WON!";
		}
		else
		{
			if(userGuess > comNumber)
			{
				msg = "Your guess is too high!";
			}
			else 
			{
				msg = "Your guess is too low!";
			}
		}
		
		// Output phase
		JOptionPane.showMessageDialog(null, "You picked the number: " + userGuess + "\nComputer's number is: " + comNumber + "\n" + msg);
		
	}
}