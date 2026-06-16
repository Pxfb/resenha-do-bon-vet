package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPetShop extends JFrame {

	private final PetShopRepositorio repositorio = new PetShopRepositorio();

	// â”€â”€ Campos do formulário
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private final JTextField campNome = new JTextField(10);
	private final JTextField campRaca = new JTextField(10);
	private final JTextField campIdade = new JTextField(10);
	private final JTextField campGenero = new JTextField(10);
	private final JTextField campDono = new JTextField(10);
	private final JTextField campTel = new JTextField(10);

	// â”€â”€ Área de resultado
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private final JTextArea areaResultado = new JTextArea(12, 50);

	// â”€â”€ Botões
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private final JButton btnCadastrar = new JButton("Cadastrar");
	private final JButton btnBuscar = new JButton("Buscar");
	private final JButton btnAtualizar = new JButton("Atualizar");
	private final JButton btnRemover = new JButton("Remover");

	// â”€â”€ Construtor
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	public TelaPetShop() {
		super("Pet Shop 0,” Gerenciador de Animais");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// O JFrame usa BorderLayout por padrÃ£o
		setLayout(new BorderLayout(8, 8));

		add(criarPainelFormulario(), BorderLayout.NORTH);
		add(criarAreaResultado(), BorderLayout.CENTER);
		add(criarPainelBotoes(), BorderLayout.SOUTH);

		configurarListeners();

		setSize(900, 600);
		pack();
		setLocationRelativeTo(null); // centraliza na tela

		setVisible(true);
	}

	// â”€â”€ Painel Norte: formulário
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private JPanel criarPainelFormulario() {
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 6));
		painel.setBorder(BorderFactory.createTitledBorder("Dados do Pet e Tutor"));

		painel.add(new JLabel("Nome:"));
		painel.add(campNome);
		painel.add(new JLabel("Raça:"));
		painel.add(campRaca);
		painel.add(new JLabel("Idade:"));
		painel.add(campIdade);
		painel.add(new JLabel("Gênero:"));
		painel.add(campGenero);
		painel.add(new JLabel("Dono:"));
		painel.add(campDono);
		painel.add(new JLabel("Telefone:"));
		painel.add(campTel);

		return painel;
	}

	// â”€â”€ Centro: Ã¡rea de texto com scroll
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private JScrollPane criarAreaResultado() {
		areaResultado.setEditable(false);
		areaResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
		areaResultado.setBorder(BorderFactory.createEmptyBorder(6, 8, 6, 8));
		exibirTexto("Bem-vindo ao sistema do Pet Shop!\n"
				+ "Preencha os campos acima e use os botões para gerenciar os pets.\n");
		return new JScrollPane(areaResultado);
	}

	// â”€â”€ Painel Sul: botÃµes
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private JPanel criarPainelBotoes() {
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 8));
		painel.add(btnCadastrar);
		painel.add(btnBuscar);
		painel.add(btnAtualizar);
		painel.add(btnRemover);
		return painel;
	}

	// â”€â”€ ActionListeners
	// â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€
	private void configurarListeners() {

		// ---- CADASTRAR ----
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				String raca = campRaca.getText().trim();
				int idade;
				char genero = campGenero.getText().charAt(0);
				String dononome = campDono.getText().trim();
				String telefone = campTel.getText().trim();

				try {
					idade = Integer.parseInt(campIdade.getText());

				} catch (NumberFormatException erro) {
					exibirTexto("Por favor, digite caracteres válidos.");
					return;
				}

				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
					return;
				}
				if (raca.isEmpty()) {
					raca = "Indefinida";
				}

				if (dononome.isEmpty()) {
					exibirTexto("Por favor preencha todos os campos");
				}

				if (telefone.isEmpty()) {
					exibirTexto("Por favor preencha todos os campos");
				}

				Cliente dono = new Cliente(dononome, telefone);
				Cachorro novo = new Cachorro(nome, raca, idade, genero);
				novo.setDono(dono);

				repositorio.adicionar(novo);
				exibirTexto("Pet cadastrado com sucesso!\n\n");
				exibirTexto(novo.exibirDados());
				limparCampos();
			}
		});

		// Buscar
		btnBuscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
					return;
				}
				if (repositorio.buscarPorNome(nome) != null) {
					exibirTexto(repositorio.buscarPorNome(nome).exibirDados());
				} else {
					exibirTexto("ERRO: Animal não encontrado.");
				}
			}

		});
		
		// Atualizar
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				String dono = campDono.getText().trim();
				String raca = campRaca.getText().trim();
				int idade;
				
				try {
					idade = Integer.parseInt(campIdade.getText());

				} catch (NumberFormatException erro) {
					exibirTexto("Por favor, digite caracteres válidos.");
					return;
				}
				
				
				
				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
					return;
				} 

				if (dono.isEmpty()) {
					exibirTexto("ERRO: O campo Dono é obrigatório.");
					return;
				}
				
				if (raca.isEmpty()) {
					exibirTexto("ERRO: O campo Raça é obrigatório.");
					return;
				} 
				Animal doguinho =repositorio.buscarPorNome(nome);
				
				
				
				
			}
			
		});

		// Remover
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText().trim();
				
				if (nome.isEmpty()) {
					exibirTexto("ERRO: O campo Nome é obrigatório.");
					return;
				} 
				
				exibirTexto(repositorio.buscarPorNome(nome).exibirDados() + " \n--Removido com sucesso!");
			if (repositorio.remover(nome) != false) {
				return;
			}

		}}); 
	}

	// Métodos auxiliares
	//

	/** Exibe texto na área de resultado, substituindo o conteÃºdo anterior. */
	private void exibirTexto(String texto) {
		areaResultado.setText(texto);
	}

	/** Limpa todos os campos do formulÃ¡rio. */
	private void limparCampos() {
		campNome.setText("");
		campRaca.setText("");
		campIdade.setText("");
		campGenero.setText("");
		campDono.setText("");
		campTel.setText("");
		campNome.requestFocus();
	}

}