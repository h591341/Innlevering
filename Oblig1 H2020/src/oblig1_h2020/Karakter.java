package oblig1_h2020;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {

	public static void main(String[] args) {
		char karakter = ' ';
		boolean valid = false;
		for (int tall = 1; tall <= 10; tall++) {
			
			valid = false;
			
			while (!valid) {
				
				int poeng = parseInt(showInputDialog("Skriv inn poengsum for student " + tall));
				if (0 <= tall && tall <= 100) {
					valid = true;
				}
				
				if (poeng >= 0 && poeng < 40) {
					karakter = 'F';
				}
		
				else if (40 <= poeng && poeng < 50) {
					karakter = 'E';
				}
		
				else if (50 <= poeng && poeng < 60) {
					karakter = 'D';
				}
		
				else if (60 <= poeng && poeng < 80) {
					karakter = 'C';
				}
		
				else if (80 <= poeng && poeng < 90) {
					karakter = 'B';
				}
		
				else if (90 <= poeng && poeng <= 100) {
					karakter = 'A';
				}
		
				else {
					showMessageDialog(null, "Ugyldig poengsum, summen må være mellom 0 og 100");
					valid = false;
					}
		
				}
				showMessageDialog(null, "Studenten fikk karakteren: " + karakter);
		
			}
		}
	
	}
