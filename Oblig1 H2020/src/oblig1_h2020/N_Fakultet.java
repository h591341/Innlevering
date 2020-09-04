package oblig1_h2020;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class N_Fakultet {

	public static void main(String[] args) {
	
		int resultat = sum(parseInt(showInputDialog("Skriv inn n")));
	    if (resultat == 0) {
	    	showMessageDialog(null, "Fakultet av negative tall er ikke gyldig");
	    }
		showMessageDialog(null, resultat);
		
	  }
	  public static int sum(int n) {
	    if (n > 0) {
	    	return n * sum(n - 1); } 
	    else if (n == 0) {
	    	 return 1;
	    }
	    else {
	    	return 0;
	    }
	  }
	}	