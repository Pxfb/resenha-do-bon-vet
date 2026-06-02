package main;

public class ClinicaVeterinaria {
	public static void main (String [] args) {

		Cliente Yasmin = new Cliente("Yasmin", "000000000000");
		Cliente Jotape = new Cliente("João Pedro", "676767676767");
		
		Cachorro Lili = new Cachorro("Lili", "SRD", 13, 'F');
		Cachorro Amora = new Cachorro("Amora", "SRD", 11, 'F');
		Cachorro Mitski = new Cachorro("Mitski", "Pastor Alemão", -3, 'F');
		
		Lili.setDono(Yasmin); 
		Amora.setDono(Yasmin);
		Mitski.setDono(Jotape);
		
		Yasmin.exibirInfo();
		Jotape.exibirInfo();
		Lili.exibirDados();
		Amora.exibirDados();
		Mitski.exibirDados();
		
		Lili.comer();
		Amora.latir();
		Mitski.latir();
		
		System.out.println("Total de cães na clínica: " + Cachorro.gettotalCachorros());
		
	}
}

