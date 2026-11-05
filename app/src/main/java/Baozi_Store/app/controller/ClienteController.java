package Baozi_Store.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layers")
public class ClienteController {

	@PostMapping("/cadastrar-cliente/salvar")
	public String cadastroCliente() {
		return ("/layers/cadastrar-cliente");
		
	}

	@GetMapping("/listar-clientes")
	public String listarCliente() {
		return ("lista-cliente");

	}
	
	
}
