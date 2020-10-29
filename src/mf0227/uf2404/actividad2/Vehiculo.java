package mf0227.uf2404.actividad2;

/**
 * La clase de vehiculos tendra 3 atributos, sera la clase padre de coche y
 * implementa la interfaz de IConducible.<br>
 * Los 3 atributos que tiene son las siguientes:
 * <ul>
 * <li>Color</li>
 * <li>Matricula</li>
 * <li>isArrancado</li>
 * </ul>
 * 
 * @author Julen Martin
 *
 */
public class Vehiculo implements IConducible {

	private String color;
	private String matricula;
	private boolean isArrancado;

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
		this.isArrancado = false;
	}

	public Vehiculo(String color, String matricula, boolean isArrancado) {
		this.color = color;
		this.matricula = matricula;
		this.isArrancado = isArrancado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isArrancado() {
		return isArrancado;
	}

	public void setArrancado(boolean isArrancado) {
		this.isArrancado = isArrancado;
	}

	@Override
	public void arrancar() {
		if (!isArrancado) {
			isArrancado = true;
			System.out.println("Esta arrancado");
		}

	}

	@Override
	public void parar() {
		if (isArrancado) {
			isArrancado = false;
			System.out.println("Esta apagado");
		}

	}

}
