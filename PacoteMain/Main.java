package PacoteMain;

import PacoteMain.endereco.Endereco;
import PacoteMain.cliente.Cliente;
import PacoteMain.itemTema.ItemTema;
import PacoteMain.tema.Tema;

public class Main {

	public static void main(String[] args) {
		ItemTema itemTema = new ItemTema(1, "Vaso", "Guarda flor");
		Tema tema = new Tema (2, "Halloween", 500.00, "Laranja");
		Cliente cliente = new Cliente (3, "Jack", "15 9982-2819", "6374871719", "3572829");
		Endereco endereco = new Endereco(4, "Rua Wallachia", 281, "Casa", "Jardim Espirita", "São Paulo", "875790", "27617");
		
		
		System.out.println(itemTema.getId());
		System.out.println(itemTema.getNome());
		System.out.println(itemTema.getDescricao());
		
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAluguel());
		System.out.println(tema.getCorToalha());
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
		
		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());

	}

}
