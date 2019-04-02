package sv.com.fpalacios.servicio.process;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import sv.com.fpalacios.servicio.models.Alumno;
import sv.com.fpalacios.servicio.models.Curso;
import sv.com.fpalacios.servicio.models.CursoAlumno;

public class ClienteProcess {

	public String convertirObjectoAXmlStringJAXB(CursoAlumno cursoAlumno) {
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		String xml = null;
		
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(CursoAlumno.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(cursoAlumno, outputStream);
			xml = new String(outputStream.toByteArray());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return xml;
		
	}
	
	public CursoAlumno popularCursosYAlumnosDummies() {
		
		CursoAlumno cursoAlumno = new CursoAlumno();
		
		List<Curso> cursos = new ArrayList<Curso>();
		for (int i = 1; i <= 3; i++) {
			List<Alumno> alumnos = new ArrayList<Alumno>();
			for (int j = 1; j <= 2; j++) {
				Alumno alumno = new Alumno("duiAlumno" + j, "idAlumno" + j, "nombreAlumno" + j, "solventeAlumno" + j);
				alumnos.add(alumno);
			}
			Curso curso = new Curso("000" + i, "idCurso" + i, "nombreCurso" + i, alumnos);
			curso.getAlumnos().addAll(alumnos);
			cursos.add(curso);
		}
		
		cursoAlumno.getCursos().addAll(cursos);
		
		return cursoAlumno;
		
	}

	public CursoAlumno filtrarCursosAlumnosPorProfesor(CursoAlumno cursoAlumno, String profesor) {

		CursoAlumno cursoAlumnoEncontrado = new CursoAlumno();
		
		for (Curso curso : cursoAlumno.getCursos()) {
			if(curso.getProfesor().equalsIgnoreCase(profesor)) {
				cursoAlumnoEncontrado.getCursos().add(curso);
				break;
			}
		}
		
		return cursoAlumnoEncontrado;
		
	}
	
}
