package repositories;

import java.io.PrintWriter;

import entities.Cliente;

//classe para armazenar, consultar, editar, consultar ou excluir informações de clientes 

public class ClienteRepository {
	
//metodos para guardar os dados em arquivos de extensao txt
	
	public void exportarDados(Cliente cliente) 
	{
		try
		{
			
			//criando a variavel e o arquivo TXT para gravar os dados do cliente
			var printWriter = new PrintWriter("c:\\temp\\cliente_"+cliente.getId()+".txt");
			
			//escrever o conteudo do arquivo
			printWriter.write("\nID do Cliente.......:"+ cliente.getId());
			printWriter.write("\nNome do Cliente.....:"+ cliente.getNome());
			printWriter.write("\nCPF do Cliente......:"+ cliente.getCpf());
			printWriter.write("\nEmail do Cliente....:"+ cliente.getEmail());
			printWriter.write("\nTelefone do Cliente.:"+ cliente.getTelefone());
			
			//fechando arquivo
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!");
		}
		
		catch(Exception e)
		{
			System.out.println("\n Falha ao gravar arquivo: "+e.getMessage());
		}
		
	}
	

}
