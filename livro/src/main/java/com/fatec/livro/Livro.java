package com.fatec.livro;

public class Livro {
	String titulo;
	String autor;
	String ano;
	String edicao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("O título não deve estar em branco");
		} else {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.isBlank()) {
			throw new IllegalArgumentException("O autor não deve estar em branco");
		} else {
			this.autor = autor;
		}
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		try {
			int a = Integer.parseInt(ano);
			if (a > 2023) {
				throw new IllegalArgumentException("O ano de publicação deve ser menor ou igual do que ano atual");
			} else {
				this.ano = ano;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("O ano de publicação deve ser menor ou igual do que ano atual");
		}
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		try {
			int e = Integer.parseInt(edicao);
			if (e <= 0) {
				throw new IllegalArgumentException("O número da edição tem que ser um número inteiro maior que zero");
			} else {
				this.edicao = edicao;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("O número da edição tem que ser um número inteiro maior que zero");
		}
	}

}
