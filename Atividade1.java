package com.halloword.hallo.Atividade1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Atividade1")
public class Atividade1 {

	@GetMapping
	public String atividade1() {
		
		return "Usei a mentalidade de persistencia e de mente de crescimento, foi muito dificil assimilar"
				+ "mas eu conseguir fazer muito obrigado generation <3:";
	}
		
	}
	

