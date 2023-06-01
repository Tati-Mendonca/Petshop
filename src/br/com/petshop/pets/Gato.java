package br.com.petshop.pets;

public class Gato extends Animal{ // importei a classe pai animal
	
	public Gato(String nome, String raca, String porte, int idade) {
		super(nome, raca, porte, idade);
	}
	
	public static void validaNome(String nome) { // metodo static pude usar nas 2 classes filhas pois ela não tem a ver com nenhum dos objetos
	if (nome == null || nome =="") { // se nome for nulo ou vazio fica invalido
		System.out.println("Nome Inválido!");
	} else {
		System.out.println("Nome Válido!");
	}
	}
	public void miar() {
		System.out.println("miau");
	}

}









//package br.com.petshop.pets;
//
//public class Gato {
//	private String nome;
//	private String raca;
//	private String porte;
//	private int idade;
//	
//	public void andar() {
//		System.out.println("Gato andando nome: " + nome);
//	}
//
//}