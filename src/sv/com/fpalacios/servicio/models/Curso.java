package sv.com.fpalacios.servicio.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "curso")
@XmlAccessorType(XmlAccessType.FIELD)
public class Curso {

	@XmlAttribute
	private String profesor;
	private String id;
	private String nombre;
	
	@XmlElementWrapper(name = "alumnos")
	@XmlElement(name = "alumno")
	private List<Alumno> alumnos;
	
	public Curso() {
		super();
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public Curso(String profesor, String id, String nombre, List<Alumno> alumnos) {
		super();
		this.profesor = profesor;
		this.id = id;
		this.nombre = nombre;
		this.alumnos = alumnos;
		this.alumnos = new ArrayList<Alumno>();
	}



	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
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

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [profesor=");
		builder.append(profesor);
		builder.append(", id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", alumnos=");
		builder.append(alumnos);
		builder.append("]");
		return builder.toString();
	}
	
}