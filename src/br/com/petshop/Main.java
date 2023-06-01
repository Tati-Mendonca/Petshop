package br.com.petshop;

import br.com.petshop.pets.Animal;
import br.com.petshop.pets.Cachorro; //importar a classe que está em outro package Ctrl+Shift+O

public class Main {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro("toto","sem raca definida", "medio", 10); //aqui vamos instanciar o objeto
		//toto.andar(); 
		//Cachorro.validaNome(" "); 
	   
		Cachorro jack = new Cachorro("jack", "pitbull","grande", 8);
		jack.andar();

		jack.latir();
		//jackCachorro.latir();
		//Cachorro jackCachorro = (Cachorro) jack;
		
	}

}






















//package br.com.petshop;
//
//import br.com.petshop.pets.Cachorro; //importar a classe que está em outro package Ctrl+Shift+O
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Cachorro toto = new Cachorro("toto","sem raca definida", "medio", 10); //aqui vamos instanciar o objeto
//		toto.andar(); // esta acossiado ao meu objeto de nome toto
//		
//		Cachorro.validaNome(""); // não pertence ao meu objeto é um validação tecnica por isso é de Class Static
//	}
//
//}