package sv.com.fpalacios.servicio.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ClienteService {

	@WebMethod
	public String obtenerCliente(String dui);
	
}
