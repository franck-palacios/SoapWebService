package sv.com.fpalacios.servicio.service;

import javax.jws.WebService;

import sv.com.fpalacios.servicio.models.CursoAlumno;
import sv.com.fpalacios.servicio.process.ClienteProcess;

@WebService(endpointInterface = "sv.com.fpalacios.servicio.service.ClienteService")
public class ClienteServiceImpl implements ClienteService {

	@Override
	public String obtenerCliente(String profesor) {
		
		ClienteProcess clienteProcess = new ClienteProcess();
		String xml = "";
		
		// emulamos que traemos 3 tuplas de la base de datos
		CursoAlumno cursoAlumno = clienteProcess.popularCursosYAlumnosDummies();
		System.out.println(cursoAlumno);
		
		// filtrar la lista de CursoAlumno para que solo quede el curso cuyo dui
		CursoAlumno cursoAlumnoFiltrado = clienteProcess.filtrarCursosAlumnosPorProfesor(cursoAlumno, profesor);
		
		// convertimos el objeto CursoAlumno a xml
		xml = clienteProcess.convertirObjectoAXmlStringJAXB(cursoAlumnoFiltrado);
//		System.out.println(xml);
		
		return xml;
	}

}
