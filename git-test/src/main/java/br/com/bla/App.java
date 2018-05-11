package br.com.bla;

import br.com.bla.model.Ligacao;
import br.com.bla.model.Medidor;

public class App {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println("Novo system out");
		System.out.println("Mais um!");
		System.out.println("outro teste!");
		System.out.println(new Ligacao(new Long(111), new Long(989098), "RUA DO ZE MANE", new Medidor(new Long(2222), "XX1234XX")));
	}

}
