package mf0227.uf2404.actividad2;

/**
 * La clase de coche tendra 4 atributos y sera la clase hija de vehiculo.<br>
 * Los atributos son los siguientes:
 * <ul>
 * <li>Marca</li>
 * <li>Modelo</li>
 * <li>Potencia</li>
 * <li>Cilindrada</li>
 * </ul>
 * 
 * @author Julen Martin
 *
 */
public class Coche extends Vehiculo {

	private String marca;
	private String modelo;
	private float potencia;
	private float cilindrada;

	public Coche() {
		super();
		this.cilindrada = 0;
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
	}

	public Coche(String color, String matricula, boolean isArrancado, float cilindrada, float potencia, String marca,
			String modelo) {
		super(color, matricula, isArrancado);
		this.cilindrada = cilindrada;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

}
