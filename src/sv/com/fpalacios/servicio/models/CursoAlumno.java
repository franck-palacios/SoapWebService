package sv.com.fpalacios.servicio.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class CursoAlumno {

	@XmlElementWrapper(name = "cursos")
	@XmlElement(name = "curso")
	private List<Curso> cursos;

	public CursoAlumno() {
		super();
		this.cursos = new ArrayList<Curso>();
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CursoAlumno [cursos=");
		builder.append(cursos);
		builder.append("]");
		return builder.toString();
	}
	
}