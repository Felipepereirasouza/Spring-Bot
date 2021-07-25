package com.halloword.hallo.Atividade2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividade2")
public class Atividade2 {
	
	@GetMapping
	public String Atividade() {
	
		return "Desejo essa semana aprender Spring bot e também revisar algumas coisas do curso <3, como banco de dados"
				+ " e documentações de linguagens para praticar <3:";
		
		
		
	}
	

}
