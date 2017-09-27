// ContaCorrente

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	private String nome;
	private int num_conta;
	private double saldo;
	
	// construtores:
	// padrão:
		public ContaCorrente(){
			
		}
		
	// toString:
	public String toString() {
		return "Nome: " + nome +
				"\nNumero da conta: " + num_conta +
				"\nSaldo: R$ " + saldo;
	}
	
	// APENAS SETTERS:
	// NOME:
	public void setNome(String nome) {
		this.nome = nome;
	}
	// NUMERO DA CONTA:
	public void setNum_Conta(int num_conta) {
		this.num_conta = num_conta;
	}
	// SALDO:
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// SAQUE:
	public void setSaque(Double saque) {
		if (saque<=saldo) {
			saldo-=saque;
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}
	// DEPOSITO:
	public void setDeposito(Double deposito){
		saldo += deposito;;
	}
}