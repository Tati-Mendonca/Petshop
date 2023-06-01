package br.com.petshop.pets;

public class Cachorro extends Animal{ // importei a classe pai animal
	
	public Cachorro(String nome, String raca, String porte, int idade) {
		super(nome, raca, porte, idade);
	}
	
	public static void validaNome(String nome) { // metodo static pude usar nas 2 classes filhas pois ela não tem a ver com nenhum dos objetos
	if (nome == null || nome =="") { // se nome for nulo ou vazio fica invalido
		System.out.println("Nome Inválido!");
	} else {
		System.out.println("Nome Válido!");
	}
	}
	
	public void latir() {
		System.out.println("Cachorro  latiu: au au");
	}
}
	


























//package br.com.petshop.pets;
//
//import java.time.LocalDateTime;
//
//public class Cachorro {
//	
//	private String nome; //Sempre crio os atributos privados para ninguem mexer neles
//	private String raca;
//	private String porte;
//	private int idade;
//	
//	public Cachorro(String nome, String raca, String porte, int idade) { //metodo contrutor, o que ele precisa para ser um objeto cachorro?
//		this.nome = nome; // usamos o this para associar ele ao atributo global e não a variavel do escopo
//		this.raca = raca; //Atalho em source> generechion construtor
//		this.porte = porte;
//		this.idade = idade;
//	} 
//	
//	public static void validaNome(String nome) { // metodo static pois vamos validar apenas algo técnico, não tem nada a ver com meus objetos
//		if (nome == null || nome =="") { // se nome for nulo ou vazio fica invalido
//			System.out.println("Nome Inválido!");
//		} else {
//			System.out.println("Nome Válido!");
//		}
//	}
//	
//	
//
//	
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getRaca() {
//		return raca;
//	}
//
//	public void setRaca(String raca) {
//		this.raca = raca;
//	}
//
//	public String getPorte() {
//		return porte;
//	}
//
//	public void setPorte(String porte) {
//		this.porte = porte;
//	}
//
//	public int getIdade() {
//		return idade;
//	}
//
//	public void setIdade(int idade) {
//		this.idade = idade;
//	}
//
//	public void andar() { //metodo anda sem retorno - metodo sempre tem q ser um verbo
//		System.out.println(" Chachorro andando nome: " + nome);
//	}
//	
//	
//
//}
