package classeexecutavel;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Empresa;
import model.Endereco;
import model.Funcionario;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
		empresa.setTel(Long.parseLong(telefone));
		String email = JOptionPane.showInputDialog("Digite o email: ");
		empresa.setEmail(email);
		String matriz = JOptionPane.showInputDialog("Matriz? [SIM | NÃO]");
		
		if(matriz == "SIM") {
			empresa.setMatriz(true);
		}else {
			empresa.setMatriz(false);
		}
		Endereco endereco = new Endereco();
		
		String nomeRua = JOptionPane.showInputDialog("Nome da rua da empresa: ");
		endereco.setNomeRua(nomeRua);
		String numero = JOptionPane.showInputDialog("Número empresa: ");
		endereco.setNumero(Integer.parseInt(numero));
		String bairro = JOptionPane.showInputDialog("Bairro empresa: ");
		endereco.setBairro(bairro);
		String cidade = JOptionPane.showInputDialog("Cidade empresa: ");
		endereco.setCidade(cidade);
		String uf = JOptionPane.showInputDialog("Estado empresa: ");
		endereco.setUf(uf);
		String complemento = JOptionPane.showInputDialog("Complemento: ");
		endereco.setComplemento(complemento);
		String cep = JOptionPane.showInputDialog("CEP empresa: ");
		endereco.setCep(Long.parseLong(cep));
		
		empresa.setEndereco(endereco);
		
		Funcionario funcionario = new Funcionario();
		String nomeF = JOptionPane.showInputDialog("Nome do funcionario: ");
		funcionario.setNome(nomeF);
		String setorF = JOptionPane.showInputDialog("Setor do funcionario: ");
		funcionario.setSetor(setorF);
		String ramalF = JOptionPane.showInputDialog("Ramal do funcionario: ");
		funcionario.setRamal(Long.parseLong(ramalF));
		String matriculaF = JOptionPane.showInputDialog("Matricula do funcionario: ");
		funcionario.setMatricula(Integer.parseInt(matriculaF));
		String cargoF = JOptionPane.showInputDialog("Nome do funcionario: ");
		funcionario.setCargo(cargoF);
		
		nomeRua = JOptionPane.showInputDialog("Nome da rua do funcionario: ");
		endereco.setNomeRua(nomeRua);
		numero = JOptionPane.showInputDialog("Número do endereco funcionario: ");
		endereco.setNumero(Integer.parseInt(numero));
		bairro = JOptionPane.showInputDialog("Bairro funcionario: ");
		endereco.setBairro(bairro);
		cidade = JOptionPane.showInputDialog("Cidade funcionario: ");
		endereco.setCidade(cidade);
		uf = JOptionPane.showInputDialog("Estado funcionario ");
		endereco.setUf(uf);
		complemento = JOptionPane.showInputDialog("Complemento: ");
		endereco.setComplemento(complemento);
		cep = JOptionPane.showInputDialog("CEP funcionario: ");
		endereco.setCep(Long.parseLong(cep));
		
		funcionario.setEndereco(endereco);
		
		empresa.setFuncionario(funcionario);
		
		Cliente cliente = new Cliente();
		
		String nomeC = JOptionPane.showInputDialog("Nome Cliente: ");
		cliente.setNome(nomeC);
		String cpf = JOptionPane.showInputDialog("CPF Cliente: ");
		cliente.setCpf(Integer.parseInt(cpf));
		String telC = JOptionPane.showInputDialog("Telefone Cliente");
		cliente.setTel(Long.parseLong(telC));
		
		nomeRua = JOptionPane.showInputDialog("Nome da rua do cliente: ");
		endereco.setNomeRua(nomeRua);
		numero = JOptionPane.showInputDialog("Número do endereco cliente: ");
		endereco.setNumero(Integer.parseInt(numero));
		bairro = JOptionPane.showInputDialog("Bairro cliente: ");
		endereco.setBairro(bairro);
		cidade = JOptionPane.showInputDialog("Cidade cliente: ");
		endereco.setCidade(cidade);
		uf = JOptionPane.showInputDialog("Estado cliente:  ");
		endereco.setUf(uf);
		complemento = JOptionPane.showInputDialog("Complemento: ");
		endereco.setComplemento(complemento);
		cep = JOptionPane.showInputDialog("CEP cliente: ");
		endereco.setCep(Long.parseLong(cep));
		
		cliente.setEndereco(endereco);
		
		empresa.setCliente(cliente);
		
		System.out.println("Matriz: "+empresa.getMatriz());
		System.out.println("Rua empresa: "+empresa.getEndereco().getNomeRua());
		System.out.println("Nome funcionario: "+empresa.getFuncionario().getNome());
		System.out.println("Endereco funcionario: "+empresa.getFuncionario().getEndereco().getNomeRua());
		System.out.println("Nome cliente: "+empresa.getCliente().getNome());
		System.out.println("Endereco cliente: "+empresa.getCliente().getEndereco().getNomeRua());
		
		
	}

}
