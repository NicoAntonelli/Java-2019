package arrayListNotas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Double> notasAlu = new ArrayList<Double>();
		notasAlu.add(6.0);
		notasAlu.add(7.5);
		notasAlu.add(4.0);
		notasAlu.add(2.0);
		
		Notas notasManager = new Notas();
		System.out.println(notasManager.cantAprobadas(notasAlu));
	}

}
