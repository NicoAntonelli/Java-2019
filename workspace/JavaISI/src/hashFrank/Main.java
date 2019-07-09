package hashFrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Persona> personas = new HashMap<Integer, Persona>();
		
		Persona p1 = new Persona(12321,"franco","g");
		Persona p2= new Persona(12345,"francko","h");
		Persona p2Rep= new Persona(12345,"fran","hi");
		
		personas.put(p1.getDni(), p1);
		personas.put(p2.getDni(), p2);
		personas.put(p2Rep.getDni(), p2Rep);
		
		JOptionPane.showMessageDialog(null, "Size : "+personas.size());
		
		for(Persona p : personas.values()) {
			System.out.println(p);
		}
		
		for(Map.Entry item: personas.entrySet()) {
			Integer clave =(Integer)item.getKey();
			Persona per =(Persona)item.getValue();
			System.out.println("Key : "+clave+" , valor : "+per);
		}
		
		Iterator it = personas.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key =(Integer)it.next();
			System.out.println("Key : "+key+" , valor : "+personas.get(key));
		}
		
		personas.remove(12321);
		
		System.out.println("contains Key = 12345? "+personas.containsKey(12345));
		System.out.println("contains value p2?" +personas.containsValue(p2));
		
		System.out.println("get : "+personas.get(12321));
		
		

	}
}
