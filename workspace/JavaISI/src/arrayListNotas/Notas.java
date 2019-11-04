package arrayListNotas;

import java.util.ArrayList;

public class Notas {
	
	public final int cantAprobadas(ArrayList<Double> notas) {
		int count = 0;
		for(Double nota : notas) {
			if (nota >= 6) { count++; }
		}
		return count;
		
	}
	
}
