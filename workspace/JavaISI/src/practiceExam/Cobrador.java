package practiceExam;

import java.util.ArrayList;
import java.util.Date;

public class Cobrador extends Empleado {
	private Double minimoPremio;
	private Double importePremio;
	private ArrayList<Venta> ventas;
	
	// @Override
	public Double getSueldo() {
		Double sueldo = super.getSueldoBasico();
		Double acum = 0.0;
		for(Venta ven : this.getVentas()) {
			acum += ven.getTotal();
		}
		if (acum > this.getMinimoPremio()) {
			return sueldo + this.getImportePremio();
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

	public Double getMinimoPremio() {
		return minimoPremio;
	}

	public void setMinimoPremio(Double minimoPremio) {
		this.minimoPremio = minimoPremio;
	}

	public Double getImportePremio() {
		return importePremio;
	}

	public void setImportePremio(Double importePremio) {
		this.importePremio = importePremio;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}

}
