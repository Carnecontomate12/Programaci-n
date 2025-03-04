package Modelo;

public abstract class Figura {
	private String color;
	public Figura (String color) {
		this.color = color;
	}
	public abstract double calcularArea ();
	public String getColor () {
		return color;
	}
	public class Triangulo extends Figura {

		public Triangulo(String color) {
			super(color);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double calcularArea() {
			int base = 7;
			int altura = 10;
			int area = base*altura/2;
			return area;
		}
		
	}
	public class Circulo extends Figura {

		public Circulo(String color) {
			super(color);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double calcularArea() {
			double pi = 3.1416;
			double r2 = 15;
			double area = pi*r2;
			return area;
		}
		
	}
}
