package net.ddeleon.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sun.el.parser.ParseException;

import net.ddeleon.model.Cliente;

@Controller
public class HomeController {
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) throws ParseException {
		List<Cliente> lista = getClientes();
		model.addAttribute("clientes", lista);
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarCliente(Model model) {
		Cliente cliente = new Cliente();
		cliente.setNomCli("Stark Industries");
		cliente.setContacto("Tony Stark");
		cliente.setDireccion("Rincón 777");
		cliente.setHsCargables(1);
		cliente.setHonorarios(10000);
		model.addAttribute("cliente", cliente);
		return "detalle";
	}
	

	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a Tima App");
		return "home";
	}
	
	private List<Cliente> getClientes() throws ParseException{
		List<Cliente> lista = new LinkedList<Cliente>();
		Cliente cliente = new Cliente();
		cliente.setNomCli("Stark Industries");
		cliente.setContacto("Tony Stark");
		cliente.setDireccion("Rincón 777");
		cliente.setHsCargables(1);
		cliente.setHonorarios(10000);
		lista.add(cliente);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNomCli("Wayne Enterprises");
		cliente1.setContacto("Bruce Wayne");
		cliente1.setDireccion("Yi 1437");
		cliente1.setHsCargables(1);
		cliente1.setHonorarios(500000);
		lista.add(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNomCli("ACME");
		cliente2.setContacto("Looney Tunes");
		cliente2.setDireccion("18 de diciembre 1234");
		cliente2.setHsCargables(1);
		cliente2.setHonorarios(100000);
		lista.add(cliente2);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNomCli("CLOTA CORPORATION");
		cliente3.setContacto("Naara Barrios");
		cliente3.setDireccion("Raúl Yude s/n");
		cliente3.setHsCargables(1);
		cliente3.setHonorarios(100);
		lista.add(cliente3);
		
		return lista;
	}
}
