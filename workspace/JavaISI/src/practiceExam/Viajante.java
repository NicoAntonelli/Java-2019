package practiceExam;

import java.util.ArrayList;

public class Viajante extends Empleado {
	Categoria categoria;
	private ArrayList<Cliente> clientes;
	
	// @Override
	public Double getSueldo() {
		// int count = 0;
		Double acum = 0.0;
		for(Cliente cli : this.getClientes()) {
			ArrayList<Venta> cliVentas = cli.getVentasDelMes();
			for(Venta ven : cliVentas) {
				acum += ven.getTotal();
			}
		}
		Double porcenComic = this.getCategoria().getPorcentajeComision();
		return acum*porcenComic;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
