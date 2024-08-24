package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

//CLasse principal responsavel por executar o projeto

public class Main 
{

//Metodo para executarmos a classe principal do projeto

	public static void main(String[] args) 
	{
		System.out.println("Sistema para cadastro e clientes");
		System.out.println("Turma de Java WebDeveloper - Sábado");
		
		//objeto para classe cliente
		var cliente = new Cliente();
		
		//preechendo dados do cliente
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
		cliente.setEmail(JOptionPane.showInputDialog("Digite seu email: "));
		cliente.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
		
		//imprimindo os dados do cliente
		System.out.println("\nDados do CLiente");
		System.out.println("\tId: " + cliente.getId());
		System.out.println("\tnome: " + cliente.getNome());
		System.out.println("\tcpf: " + cliente.getCpf());
		System.out.println("\temail: " + cliente.getEmail());
		System.out.println("\ttelefone: " + cliente.getTelefone());
		
		//criando um objeto para a classe ClienteRepository
		var clienteRepository = new ClienteRepository();
		
		//executando a exportação dos dados para arquivo
		clienteRepository.exportarDados(cliente);
	}
	
	
 }
