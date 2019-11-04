package practiceExam;

public class Categoria {
	
	// Constructor
	public Categoria(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	private double porcentajeComision;

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
}
