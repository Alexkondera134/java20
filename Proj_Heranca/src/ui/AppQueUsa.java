package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Alex");
		p.setEmail("email");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setMatricula(12334);
		e.setEmail("@@@@@");
		e.setNome("Ronaldo");
		e.setCurso("mate");
		
		e.exibir();
	}

}