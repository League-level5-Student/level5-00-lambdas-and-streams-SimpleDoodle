package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		ActionListener aL = (ActionEvent e) -> {
			JButton source = (JButton) e.getSource();
			if (source == addNumbers) {
				Scanner numbers = new Scanner(System.in);
				System.out.println("Type in your 1st number");
				int a = numbers.nextInt();
				System.out.println("Type in your 2nd number");
				int b = numbers.nextInt();
				int c = a+b;
				System.out.println(c);
			}
			else if (source == randNumber) {
				Random rand = new Random();
				int i = rand.nextInt(10);
				System.out.println(i);
			}
			else {
				System.out.println("Did you hear about the first restaurant to open on the moon?");
				System.out.println("It had great food, but no atmosphere.");
			}
		};
		addNumbers.addActionListener(aL);
		randNumber.addActionListener(aL);
		tellAJoke.addActionListener(aL);
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
