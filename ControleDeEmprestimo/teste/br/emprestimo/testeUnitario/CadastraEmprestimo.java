package br.emprestimo.testeUnitario;

import org.junit.After;
import org.junit.Before;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class CadastraEmprestimo{
	
	private static Emprestimo emprestimo;
	private static Livro livro;
	private static Usuario usuario;
	
	@Before
	public void setUp(){
		livro = new Livro();
		livro.setAutor("Autor");
		livro.setIsbn("00000");
		livro.setTitulo("Titulo");
		
		usuario = new Usuario();
		//set values
		usuario.setNome("nome");
		usuario.setRa("000000");
		
		
		emprestimo = new Emprestimo();
		//set values
		emprestimo.setDataDevolucao(data);
	}
	
	@After
	public void tearDown(){
	}
	
}


