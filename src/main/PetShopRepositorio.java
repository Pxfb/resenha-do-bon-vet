package main;

import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {

	private final ArrayList<Animal> animais = new ArrayList<>();

	/** Adiciona um animal na lista. */
	public void adicionar(Animal a) {
		animais.add(a);
	}

	/**
	 * Busca um animal pelo nome (case-insensitive).
	 * 
	 * @return o Animal encontrado, ou null se não existir.
	 */
	public Animal buscarPorNome(String nome) {
		int tamanho = animais.size();
		if (animais.size() == 0) {
			System.out.println("Não existem animais.");
			return null;
		}
		for (int n = 0; n <= tamanho-1; n++) {
			Animal animal = animais.get(n);
			if (nome.equals(animal.getNome())) {
				System.out.println("Animal encontrado: " + animais.get(n).exibirDados());
				return animais.get(n);
			}

		}
		System.out.println("Animal não encontrado.");
		return null;
	}

	/**
	 * Remove o animal com o nome informado.
	 * 
	 * @return true se encontrou e removeu, false caso contrário.
	 */
	public boolean remover(String nome) {
		if (animais.size() == 0) {
			System.out.println("Não existem animais.");
			return false;
		} 
		for (int n = 0; n <= animais.size()-1; n++) {
			if (nome.equals(animais.get(n).nome)) {
				animais.remove(n); 
				System.out.println("Animal removido com sucesso.");
				return true;
			}
			
		}
		
			return false;
	}

	/** Retorna a lista completa de animais cadastrados (cópia defensiva). */
	public ArrayList<Animal> listarTodos() {
		return animais;
	}

	/** Quantidade de animais cadastrados no repositório. */
	public int quantidade() {
		return 0;
	}
}