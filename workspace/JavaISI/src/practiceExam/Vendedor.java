package practiceExam;

import java.util.ArrayList;
import java.util.Date;

public class Vendedor extends Empleado {
	private int cantVentasMinimas;
	private Double porcentComision;
	private ArrayList<Venta> ventas;
	
	// @Override
	public Double getSueldo() {
		Double sueldo = super.getSueldoBasico();
		Double acum = 0.0;
		int count = 0;
		for(Venta ven : this.getVentas()) {
			acum += ven.getTotal();
			count++;
		}
		if (count > this.getCantVentasMinimas()) {
			return sueldo + (acum * this.getPorcentComision());
		} else {
			return sueldo;
		}
	}
	
	@SuppressWarnings("deprecation")
	// Varios métodos de Date están deprecados, suele usarse Calendar
	public ArrayList<Venta> getVentasDelMes() {
		Date hoy = new Date(); hoy.setHours(0);
		int mes = hoy.getMonth();
		ArrayList<Venta> ventasMes = new ArrayList<Venta>();
		for(Venta ven : this.ventas) {
			if (ven.getFecha().getMonth() == mes) {
				ventasMes.add(ven);
			}
		}
		return ventasMes;
	}
	
	public int getCantVentasMinimas() {
		return cantVentasMinimas;
	}

	public void setCantVentasMinimas(int cantVentasMinimas) {
		this.cantVentasMinimas = cantVentasMinimas;
	}

	public Double getPorcentComision() {
		return porcentComision;
	}

	public void setPorcentComision(Double porcentComision) {
		this.porcentComision = porcentComision;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
}
