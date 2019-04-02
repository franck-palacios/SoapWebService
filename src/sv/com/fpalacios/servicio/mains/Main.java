package sv.com.fpalacios.servicio.mains;

import javax.xml.ws.Endpoint;

import sv.com.fpalacios.servicio.service.ClienteServiceImpl;

public class Main {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:1515/ws/clientes", new ClienteServiceImpl());
		System.out.println("Servicio Levantado");
		
		ClienteServiceImpl impl = new ClienteServiceImpl();
		System.out.println(impl.obtenerCliente("0003"));
		
	}

}
