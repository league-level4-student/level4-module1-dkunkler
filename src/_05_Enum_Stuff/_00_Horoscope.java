package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	String horoscope = "";
	void TransformZodiac(ZodiacSigns zodiac) {
		switch(zodiac) {
		case AQUARIUS:
			horoscope = "Your Aquarius horoscope is: you will meet a special person.";
			break;
		case PISCES:
			horoscope = "Your Pisces horoscope is: you will meet a special person.";
			break;
		case ARIES:
			horoscope = "Your Aries horoscope is: you will meet a special person.";
			break;
		case TAURUS:
			horoscope = "Your Taurus horoscope is: you will meet a special person.";
			break;
		case GEMINI:
			horoscope = "Your Gemini horoscope is: you will meet a special person.";
			break;
		case CANCER:
			horoscope = "Your Cancer horoscope is: you will meet a special person.";
			break;
		case LEO:
			horoscope = "Your Leo horoscope is: you will meet a special person.";
			break;
		case VIRGO:
			horoscope = "Your Virgo horoscope is: you will meet a special person.";
			break;
		case LIBRA:
			horoscope = "Your Libra horoscope is: you will meet a special person.";
			break;
		case SCORPIO:
			horoscope = "Your Scorpio horoscope is: you will meet a special person.";
			break;
		case SAGITTARIUS:
			horoscope = "Your Sagittarius horoscope is: you will meet a special person.";
			break;
		case CAPRICORN:
			horoscope = "Your Capricorn horoscope is: you will meet a special person.";
			break;
		default:
			horoscope = "Your horoscope is: you will meet a special person.";
			break;
		}
		
		JOptionPane.showMessageDialog(null, horoscope);
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope horoscope = new _00_Horoscope(); 
		String input = JOptionPane.showInputDialog("What is your zodiac sign?");
		ZodiacSigns zodiacSign;
		switch(input) {
		case "Aquarius":
			zodiacSign = ZodiacSigns.AQUARIUS; 
			break;
		case "Pisces":
			zodiacSign = ZodiacSigns.PISCES;
			break;
		case "Aries":
			zodiacSign = ZodiacSigns.ARIES;
			break;
		case "Taurus":
			zodiacSign = ZodiacSigns.TAURUS;
			break;
		case "Gemini":
			zodiacSign = ZodiacSigns.GEMINI;
			break;
		case "Cancer":
			zodiacSign = ZodiacSigns.CANCER;
			break;
		case "Leo":
			zodiacSign = ZodiacSigns.LEO;
			break;
		case "Virgo":
			zodiacSign = ZodiacSigns.VIRGO;
			break;
		case "Libra":
			zodiacSign = ZodiacSigns.LIBRA;
			break;
		case "Scorpio":
			zodiacSign = ZodiacSigns.SCORPIO;
			break;
		case "Sagittarius":
			zodiacSign = ZodiacSigns.SAGITTARIUS;
			break;
		case "Capricorn":
			zodiacSign = ZodiacSigns.CAPRICORN;
			break;
		default:
			zodiacSign = ZodiacSigns.AQUARIUS;
			break;
		}
		
		horoscope.TransformZodiac(zodiacSign);
	}
	
}
