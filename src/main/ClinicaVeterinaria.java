package main;

public class ClinicaVeterinaria {
	public static void main (String [] args) {
		
		Cachorro Lili = new Cachorro();
		Cachorro Amora = new Cachorro();
		
		Cliente Yasmin = new Cliente("Yasmin", "000000000000");
		Yasmin.exibirInfo(); 
		
		
		Lili.nome = "Lili";
		Lili.raca = "SRD";
		Lili.idade = 13;
		Lili.faminto = true;

		
		
		Amora.nome = "Amora";
		Amora.raca = "SRD"; 
		Amora.idade = 11;
		Amora.faminto = false;
	
		
		Lili.exibirDados(); 
		Amora.exibirDados();
		
		Lili.comer();
		Amora.latir();
		
	}
}

