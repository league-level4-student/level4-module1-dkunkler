package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		switch(choice) {
		case "Sunday": 
			JOptionPane.showMessageDialog(null, "Nichiyoubi");
			break;
		case "Monday": 
			JOptionPane.showMessageDialog(null, "Getsuyoubi");
			break;
		case "Tuesday": 
			JOptionPane.showMessageDialog(null, "Kayoubi");
			break;
		case "Wednesday": 
			JOptionPane.showMessageDialog(null, "Suiyoubi");
			break;
		case "Thursday": 
			JOptionPane.showMessageDialog(null, "Mokuyoubi");
			break;
		case "Friday": 
			JOptionPane.showMessageDialog(null, "Kinyoubi");
			break;
		case "Saturdayday": 
			JOptionPane.showMessageDialog(null, "Doyoubi");
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Something went wrong :(");
			break;
		}
		//use a switch statement to do something cool for each option
		
	}
}
