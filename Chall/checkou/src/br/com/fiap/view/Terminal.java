package br.com.fiap.view;
import br.com.fiap.model.Chamado;
import br.com.fiap.model.Formulario;
import br.com.fiap.model.Funcionario;
import br.com.fiap.model.Guinchos;
import br.com.fiap.model.Localizacao;
import br.com.fiap.model.Mecanico;
import br.com.fiap.model.Solicitacao;
import br.com.fiap.model.Usuario;
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Apolice;

public class Terminal {
	public static void main(String[] args) {
		//Usuario
		Chamado abreChamado = new Chamado(123321);
		Usuario usuario = new Usuario("Rick", "54915362884", 321123, "Rickzin1200", "RickOnFiap@123");
		Localizacao localizacao = new Localizacao("Avenida Lins", "São Paulo", "IDK", "proximo a fiap, onde vende churros");
		Apolice apolice = new Apolice(12321);
		Veiculo veiculo = new Veiculo("FIAT", "Uno", (short) 1994, "EAWE-213", "idk");
		
		//Funcionario
		Solicitacao abreSolicitacao = new Solicitacao(132231);
		Funcionario func = new Funcionario ("Henrique213", "opsfugi", "Henrique", 51359);
		Guinchos guincho = new Guinchos("JOWD-912", "Guincho de Reboque", 15152);
		Mecanico mecanico = new Mecanico("seu Jorge", 6146);
		Localizacao localizacaoMecanico = new Localizacao("Aqui", "perto", "de", "voce");
		
		System.out.println(abreChamado.chamado());
		System.out.println(usuario.user());
		System.out.println(localizacao.local());
		System.out.println(apolice.numeroApolice());
		System.out.println(veiculo.vehicle());
		System.out.println(abreSolicitacao.solicitacao());
		System.out.println(func.Funcionariou());
		System.out.println(guincho.guincho());
		System.out.println(mecanico.mecanico());
		System.out.println(localizacaoMecanico.local());
	}
}
