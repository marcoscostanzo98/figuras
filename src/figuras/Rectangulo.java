package figuras;

public class Rectangulo {

	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}
	
	public double getArea() {
		return this.alto * this.ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
