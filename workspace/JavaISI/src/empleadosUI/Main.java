package empleadosUI;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import empleados.*;

public class Main {
	
	// Empleados Array
	private static Empleado empleados[] = new Empleado[20];
	
	// Main Controller
	public static void main(String[] args) {
		// this.empleados[] = new Empleado[20];
		boolean seguir=true; int cant=0;
		int seleccion;
		while(seguir & cant<empleados.length) {
			seleccion = JOptionPane.showOptionDialog(null,"Ingrese Opción","EMPLEADOS Y SUELDOS",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
					new Object[] { "Cargar Empleado", "Ver Sueldos","Salir" },"Ver Sueldos");
				switch(seleccion) {
					case 0: empleados[cant]=loadEmp(); cant++; break;
					case 1: dispSueldos(cant); break;
					case 2: System.out.println("Adiós!"); seguir=false; break;
					case -1: System.out.println("Se ha cerrado la UI. Adiós!"); seguir=false; break;
					default: break;
				}
		}
	
	}
	
	// Load Employees View
	public static Empleado loadEmp() {
		Empleado emp;
		int seleccion = JOptionPane.showOptionDialog(null,"Tipo de Empleado","CARGAR EMPLEADO",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				new Object[] { "Administrativo", "Vendedor"},"Administrativo");
		if (seleccion != -1) {
			if(seleccion==0) { emp = new Administrativo(); }
			else { emp = new Vendedor(); }
			emp.setDni(JOptionPane.showInputDialog(null,"Ingrese DNI de Empleado",JOptionPane.QUESTION_MESSAGE));
			emp.setNombre(JOptionPane.showInputDialog(null,"Ingrese Nombre de Empleado",JOptionPane.QUESTION_MESSAGE));
			emp.setApellido(JOptionPane.showInputDialog(null,"Ingrese Apellido de Empleado",JOptionPane.QUESTION_MESSAGE));
			emp.setMail(JOptionPane.showInputDialog(null,"Ingrese Email de Empleado",JOptionPane.QUESTION_MESSAGE));
			emp.setSueldoBase(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Sueldo Base de Empleado",JOptionPane.QUESTION_MESSAGE)));
			if(seleccion==0) {
				((Administrativo)emp).setHsMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese HS Mes",JOptionPane.QUESTION_MESSAGE)));
				((Administrativo)emp).setHsExtras(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese HS Extras",JOptionPane.QUESTION_MESSAGE)));
				// Podía hacer 7 variables y llamar a "LoadData" de Administrativo
				// También hacer un constructor y crear el objeto acá con las 7 variables
			} else {
				((Vendedor)emp).setPorcenComision(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese Porcentaje Comisión",JOptionPane.QUESTION_MESSAGE)));
				((Vendedor)emp).setTotalVentas(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Total Ventas",JOptionPane.QUESTION_MESSAGE)));
				// Podía hacer 7 variables y llamar a "LoadData" de Vendedor
				// También hacer un constructor y crear el objeto acá con las 7 variables
			}
			return emp;
		} else {
			System.out.println("Se ha cerrado el Cuadro de Diálogo. FINALIZADO");
			return null;
		}
	}
	
	// Display View
	public static void dispSueldos(int cant) {
		JTextArea display = new JTextArea();
		display.setText("EMPLEADOS:\n__________________________________________________\n");
		for(int i=0;i<cant;i++) {
			double sueldo = empleados[i].calcSueldo();
				display.append("\nEMPLEADO "+(i+1)+":\n"+empleados[i].getData()+"\nSueldo: "+sueldo);
				display.append("\n__________________________________________________\n");
			}
			System.out.println("Sueldos Calculados");
			JOptionPane.showMessageDialog(null,display,"SUELDOS",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
