package ejercicio41;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Negocio {
	
	// Class Attributes
	private static double precHSCom;	// $25
	private static double precHSExc;	// $30
	private static double premio;		// $100
	// private static DecimalFormat formato = new DecimalFormat("0.00");
	
	// Instance Attributes
	private HashMap<String,Integer> empleados;
	
	// Constructor
	public Negocio() {
		empleados = new HashMap<String,Integer>();
		setPrecHSCom();
		setPrecHSExc();
		setPremio();
	}
	
	// Simple HS Value
	public void setPrecHSCom() {
		String seleccion=null;
		while(seleccion==null) {
			seleccion = JOptionPane.showInputDialog(null,"Ingrese Precio de HS Simple",JOptionPane.QUESTION_MESSAGE);
			if (seleccion==null) { System.out.println("Ingrese un Número!"); }
		}
		precHSCom = Double.parseDouble(seleccion);
	}
	
	// Extra HS Value
	public void setPrecHSExc() {
		String seleccion=null;
		while(seleccion==null) {
			seleccion = JOptionPane.showInputDialog(null,"Ingrese Precio de HS Excedente",JOptionPane.QUESTION_MESSAGE);
			if (seleccion==null) { System.out.println("Ingrese un Número!"); }
		}
		precHSExc = Double.parseDouble(seleccion);
	}
	
	// Bonification Value
	public void setPremio() {
		String seleccion=null;
		while(seleccion==null) {
			seleccion = JOptionPane.showInputDialog(null,"Ingrese Valor de Bonificaciones",JOptionPane.QUESTION_MESSAGE);
			if (seleccion==null) { System.out.println("Ingrese un Número!"); }
		}
		premio = Double.parseDouble(seleccion);
	}
	
	// Class Getters
	public double getPrecHSCom() {
		return precHSCom;
	}
	public double getPrecHSExc() {
		return precHSExc;
	}
	public double getPremio() {
		return premio;
	}
	
	// Principal Menu
	public void menu() {
		int seleccion = 3;
		while(seleccion!=2 && seleccion!=-1) {
			seleccion = JOptionPane.showOptionDialog(null,"Seleccione una Tarea","CALCULADORA DE JORNALES",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				new Object[] { "Cargar Empleado", "Ver Sueldos","Salir" },"Ver Sueldos");
			switch(seleccion) {
				case 0: this.loadEmp(); break;
				case 1: this.dispJourn(); break;
				case 2: System.out.println("Adiós!"); break;
				case -1: System.out.println("Se ha cerrado la UI. Adiós!"); break;
				default: break;
			}
		}
		
	}
	
	// Load a new Employee
	public void loadEmp() {
		Empleado emp = new Empleado();
		emp.loadData();
		empleados.put(emp.getNyA(),emp.getCantHS());
	}
	
	// Calculate an Employee's Journal
	public String calcSueldo(int HS) {
		String ficha="";
		int comHS=0; int excHS=0; double prem=0;
		if(HS<=40) { comHS=HS; excHS=0; }
		else { comHS=40; excHS=HS-40; prem=this.getPremio(); }
		
		double basico = comHS*this.getPrecHSCom()+excHS*this.getPrecHSExc();
		double desc = comHS*this.getPrecHSCom()*0.195;
		double sueldo = basico-desc+prem;
		
		ficha=
		"CANTIDAD HORAS TRABAJADAS: "+HS+"	SUELDO BÁSICO: $"+String.format("%.2f",basico)+"\n"+
		"CANTIDAD HORAS SIMPLES: "+comHS+"	DESCUENTOS: $"+String.format("%.2f",desc)+"\n"+
		"CANTIDAD HORAS EXCEDENTES: "+excHS+"	PREMIO: $"+String.format("%.2f",prem)+"\n\n"+
		"A COBRAR: $"+String.format("%.2f",sueldo)+"\n"+
		"______________________________________________________________________\n";
		
		return ficha;
	}
	
	// Display Journals
	public void dispJourn() {
		// Map to Iterate all Products and Fill String Array
		Map<String,Integer> map = this.empleados;
		JTextArea display = new JTextArea();
		display.setText("SUELDOS:\n______________________________________________________________________\n");
		String dataJourn="";
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			dataJourn = calcSueldo(entry.getValue());
			display.append("\nEMPLEADO: "+entry.getKey()+"\n"+dataJourn);
		}
		System.out.println("Sueldos Calculados");
		JOptionPane.showMessageDialog(null,display,"CALCULADORA",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
