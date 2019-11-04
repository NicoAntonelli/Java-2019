package practiceExam;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	private String cuit;
	private String razonSocial;
	private String direccion;
	private ArrayList<Venta> ventas;
	
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

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
}
