package sv.com.fpalacios.servicio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "alumno")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumno {

	@XmlAttribute
	private String dui;
	private String id;
	private String nombre;
	private String solvente;
	
	public Alumno() {
		super();
	}
	
	public Alumno(String dui, String id, String nombre, String solvente) {
		super();
		this.dui = dui;
		this.id = id;
		this.nombre = nombre;
		this.solvente = solvente;
	}



	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSolvente() {
		return solvente;
	}

	public void setSolvente(String solvente) {
		this.solvente = solvente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [dui=");
		builder.append(dui);
		builder.append(", id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", solvente=");
		builder.append(solvente);
		builder.append("]");
		return builder.toString();
	}
	
}