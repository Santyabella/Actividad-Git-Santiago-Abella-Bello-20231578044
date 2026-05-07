package cdt.modelo;

import asp.modelo.Persona;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class Cliente extends Persona{

	@Positive(message = "La inversión debe ser mayor a cero")
	private double inversion;
	
	@DecimalMin(value = "0.01", message = "El interés debe ser al menos 0.01")
    @DecimalMax(value = "100.0", message = "El interés no puede exceder el 100%")
	private double interes;
	
	@Min(value = 1, message = "El plazo debe ser al menos de 1 unidad")
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
