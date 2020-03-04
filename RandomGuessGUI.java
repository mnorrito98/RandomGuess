//RandomGuessGUI.java


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RandomGuessGUI extends JFrame implements ActionListener
{
	//Instances objects/ variables / consts for this class
	JLabel title = new JLabel("Random Guess");
	JLabel insttruction = new JLabel("Please enter a number between 1 and 10");
	JTextField field = new JTextField(4);
	JLabel compResult = new JLabel("");
	JLabel summary = new JLabel("");
	JButton button = new JButton("Play Game");


	// Constructor method for this class 
	public RandomGuessGUI()
	{

		//use the JFrame to construct THIS object 
		super("Random Guess");
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Layout manager for the GUI
		setLayout(new FlowLayout());


		// add the instance object to the frame 
		add(title);
		add(insttruction);
		add(field);
		add(compResult);
		
		add(button);

		add(summary);// the button yes


		// add the listener method to the button 
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		guess();
	}

	public void guess()
	{
		// variables and constants
		int userGuess;
		int comNumber;
		String msg;
		
		// input phase
		userGuess = Integer.parseInt(field.getText());
		
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
		compResult.setText("Computer's number is: " + comNumber);
		summary.setText(msg);
		
	}

	



}