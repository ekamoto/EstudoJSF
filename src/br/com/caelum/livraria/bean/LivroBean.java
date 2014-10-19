package br.com.caelum.livraria.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}
	
	/*
	 * Podemos acompanhar o trabalho de JSF e colocar um método que é chamado 
	 * automaticamente quando JSF instancia a LivroBean
	 * 
	 * */
	@PostConstruct
	public void posCriacao() {
		System.out.println("objeto LivroBean foi criado");
	}
	
	public void gravar() {
		System.out.println("Salvando livro:"
				+this.livro.getTitulo() + "-"
				+this.livro.getIsbn() + "-"
				+this.livro.getPreco() + "-"
				+this.livro.getDataLancamento() + "-");
	}
}
