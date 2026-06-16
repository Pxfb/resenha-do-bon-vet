package main;

import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {

	private final ArrayList<Animal> animais = new ArrayList<>();

	/** Adiciona um animal à lista. */
	public void adicionar(Animal a) {
		animais.add(a);
	}

	/**
	 * Busca um animal pelo nome (case-insensitive).
	 * 
	 * @return o Animal encontrado, ou null se não existir.
	 */
	public Animal buscarPorNome(String nome) {
		for (int n = 0; n <= animais.size(); n++) {
			if (nome == animais.get(n).getNome()) {
				System.out.println("Animal encontrado:" + animais.get(n).exibirDados());
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
		return true;
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