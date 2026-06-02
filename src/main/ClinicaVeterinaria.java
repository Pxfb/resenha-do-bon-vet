package main;

public class ClinicaVeterinaria {
	public static void main (String [] args) {

		Animal[] filaAtendimento = new Animal[2]; 
		filaAtendimento[0] = new Cachorro("Rex", "Pastor Alemão", 5, 'M');
		filaAtendimento[1] = new Gato("Mingau", 2, 'M', true); 
		
		for (int i = 0; i < 2; i++) {
			filaAtendimento[i].emitirSom();  
		}
		
		
		Cliente Yasmin = new Cliente("Yasmin", "000000000000");
		Cliente Jotape = new Cliente("João Pedro", "676767676767");
		
		Cachorro Lili = new Cachorro("Lili", "SRD", 13, 'F');
		Cachorro Amora = new Cachorro("Amora", "SRD", 11, 'F');
		Cachorro Mitski = new Cachorro("Mitski", "Pastor Alemão", 1, 'F');
		Gato Caty = new Gato("Caty", 10,'F', true); 
		
		Lili.setDono(Yasmin); 
		Amora.setDono(Yasmin);
		Mitski.setDono(Jotape);
		Caty.setDono(Jotape);
		
		Lili.exibirDados();
		Amora.exibirDados();
		Mitski.exibirDados();
		Caty.exibirDados();
		
		Lili.comer();
		Amora.emitirSom();
		Mitski.emitirSom();
		
		System.out.println("Total de cães na clínica: " + Cachorro.gettotalCachorros());
		System.out.println("Total de gatos na clínica: " + Gato.gettotalGatos());
		System.out.println("Total de animais na clínica: " + Animal.gettotalAnimais());
		
	}
}

