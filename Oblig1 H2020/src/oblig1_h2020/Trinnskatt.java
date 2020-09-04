package oblig1_h2020;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Trinnskatt {

	public static void main(String[] args) {
		double trinnskatt = 0;
		int brutto = parseInt(showInputDialog("Skriv inn bruttolønn"));
		
		if (brutto >= 0 && brutto <= 164100) {
			trinnskatt = 0.00;
			showMessageDialog(null, "Trinnskatten er " + Math.round(trinnskatt * brutto));
		}
		
		else if (brutto >= 164101 && brutto <= 230950) {
			trinnskatt = 0.0093;
			showMessageDialog(null, "Trinnskatten er " + Math.round(trinnskatt * brutto));
		}
		
		else if (brutto >= 230951 && brutto <= 580650) {
			trinnskatt = 0.0241;
			showMessageDialog(null, "Trinnskatten er " + Math.round(trinnskatt * brutto));
		}
		
		else if (brutto >= 580651 && brutto <= 934050) {
			trinnskatt = 0.1152;
			showMessageDialog(null, "Trinnskatten er " + Math.round(trinnskatt * brutto));
		}
		
		else if (brutto >= 934051) {
			trinnskatt = 0.1452;
			showMessageDialog(null, "Trinnskatten er " + Math.round(trinnskatt * brutto));
		}	
		
		if (brutto < 0) {
			showMessageDialog(null, "Bruttolønn må være positiv");
		}

	}
}
