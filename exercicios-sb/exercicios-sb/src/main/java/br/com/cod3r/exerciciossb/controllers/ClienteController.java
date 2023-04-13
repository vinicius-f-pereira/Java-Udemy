package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes") //or only ("/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer") //or only ("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.345.231-00");
	}
}
