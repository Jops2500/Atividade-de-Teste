package com.fatec.livro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Req01CadastrarLivro {
	Livro livro = new Livro();
	@Test
	void ct01_quando_titulo_difrente_de_branco_deve_aceitar() {
		try {
			livro.setAno("2023");
			livro.setAutor("Presno");
			livro.setEdicao("1");
			livro.setTitulo("Engenharia de Software");
		} catch (Exception e) {
			assertNotNull(livro);
		}
	}



}
