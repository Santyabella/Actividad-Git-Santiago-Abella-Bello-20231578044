package asp.modelo;

public class Cliente extends Persona{

	private double inversion;
	private double interes;
	private double plazo;
	private double ganancia;
	private double valorFuturo;
	private double impuesto;
	private static final double ANIO = 360;
	
	
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(long id_p, String nombres, String apellidos, String telefono, String correo, double inversion, double interes, double plazo) {
		super(id_p, nombres, apellidos, telefono, correo);
		this.inversion = inversion;
		this.interes = interes;
		this.plazo = plazo;
		
	}
	public double getInversion() {
		return inversion;
	}
	public void setInversion(double inversion) {
		this.inversion = inversion;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getPlazo() {
		return plazo;
	}
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}
	public double getGanancia() {
		return ganancia;
	}
	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	public double getValorFuturo() {
		return valorFuturo;
	}
	public void setValorFuturo(double valorFuturo) {
		this.valorFuturo = valorFuturo;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public static double getAnio() {
		return ANIO;
	}
	
	public void calcular() {
        ganancia = inversion * (interes * (plazo / ANIO));
        System.out.println("ganancia: "+ganancia);
        valorFuturo = inversion + getGanancia();
        System.out.println("valorFuturo:" + valorFuturo);
        impuesto = ganancia * 0.04;
    }




	
	
}
