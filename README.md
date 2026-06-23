<img width="900" height="1000" alt="Captura de tela 2026-06-23 150337" src="https://github.com/user-attachments/assets/4c195887-0462-4528-9667-2d2b17188d0d" />

# Veterinário Bonetti 

## Documentação do Sistema

Criado por:
Yas e JP - P3 de Informática

Prof. Bonettietti :D o melhor prof 

## Introdução:
O projeto foi desenvolvido para cadastrar e gerenciar animais em uma clínica veterinária. 

## Tecnologias usadas:
Java, Eclipse e GitHub. 

## Estrutura
```
C:.
│   .classpath
│   .gitignore
│   .project
│
├───.settings
│       org.eclipse.core.resources.prefs
│       org.eclipse.jdt.core.prefs
│       org.eclipse.wst.common.project.facet.core.xml
│
├───build
│   └───classes
│       └───main
│               Animal.class
│               AtendivelNoEstetica.class
│               Cachorro.class
│               Cliente.class
│               ClinicaVeterinaria.class
│               Gato.class
│               Main.class
│               PetShopRepositorio.class
│               TelaPetShop$1.class
│               TelaPetShop$2.class
│               TelaPetShop$3.class
│               TelaPetShop$4.class
│               TelaPetShop$5.class
│               TelaPetShop.class
│
└───src
    └───main
        │   Animal.java
        │   AtendivelNoEstetica.java
        │   Cachorro.java
        │   Cliente.java
        │   ClinicaVeterinaria.java
        │   Gato.java
        │   Main.java
        │   PetShopRepositorio.java
        │   TelaPetShop.java
        │
        └───java
```

## Requisitos:

Java 21.0.10 

## Classes


Animal:
```
public abstract class Animal {
	protected String nome;
	protected int idade = 0;
	protected char genero;
	protected boolean faminto = true;
	protected static int totalAnimais = 0;
	protected Cliente dono;
```
```
	public String exibirDados() {
		if (dono != null) {
			dono.exibirInfo();
		}
		System.out.println(
				"Dados do Animal:==========\n Nome: " + nome + "\nG�nero: " + genero + "\nIdade: " + idade + " anos");
		return "Dados do Animal:==========\n Nome: " + nome + "\nG�nero: " + genero + "\nIdade: " + idade + " anos";
	}
```
-> Essa classe é responsável por criar um animal com as características nome, idade, gênero e faminto. O principal método “exibirDados” exibe os dados do dono e os dados do animal. 



AtendivelNoEstetica:
```
public void darBanho();
	public void cortarUnhas();
```
-> Essa classe é responsável por ditar quais animais são aptos a serem atendidos na parte estética do petshop. Possui dois métodos principais: dar banho e cortar unhas.

Cachorro:
```
public class Cachorro extends Animal implements AtendivelNoEstetica {
	private String raca;
	private static int totalCachorros = 0;
```
-> A classe cachorro é uma classe que herda as características de Animal e é atendível no estetica. Possui tambem característica propria (raça).

Cliente:
```
public class Cliente {
	private String nome;
	private String telefone;
```
-> A classe possui as características de Cliente, que é o dono do animal.

ClinicaVeterinaria:
```
public class ClinicaVeterinaria {
	public static void main (String [] args) {
```
-> Classe principal do sistema, responsável por testar e inicializar as funcionalidades da clínica. Cria-se objetos, e é simulado o atendimento aos animais nela. 

Gato:
```
public class Gato extends Animal {
	protected boolean arranhaMoveis;
	private static int totalGatos = 0;
```
-> A classe gato herda as características de animal e possui uma característica própria que é arranhar móveis.

Main:
```
public class Main {
	public static void main(String[] args) {
		new TelaPetShop();
```
-> Classe Main, onde se inicia a interface gráfica do sistema da clínica 

PetShopRepositorio:
```
public class PetShopRepositorio {
	private final ArrayList<Animal> animais = new ArrayList<>();
```
-> A classe é responsável por criar e guardar os métodos da interface gráfica. 

TelaPetShop:
```
public class TelaPetShop extends JFrame {
	private final PetShopRepositorio repositorio = new PetShopRepositorio();
```
-> Interface gráfica do sistema. Permite que o usuário cadastre um animal, busque um animal, atualize um animal, remova um animal ou liste todos os animais. 
