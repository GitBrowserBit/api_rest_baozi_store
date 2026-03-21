package com.example.apiRestBaoziStore.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller de inicialização do projeto
//excluir ao recomeçar o projeto
@RestController
public class InicialController {
	@GetMapping("/")
	public String ola () {
		return "ola";
	}
}
