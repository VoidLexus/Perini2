// PRINCIPAL

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
	
		int aux=1;
		
		// Instanciar Correntista:
		ContaCorrente correntista = new ContaCorrente();
		// Incluindo os dados:
		correntista.setNome(JOptionPane.showInputDialog("Digite o nome"));
		correntista.setNum_Conta(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta")));
		correntista.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo")));
			
		while (aux==1) {
							
			
			switch (Integer.parseInt(JOptionPane.showInputDialog("1-Saque / 2-Deposito / 3-Mostrar dados / 4-Sair"))) {
	        	case 1:
		           	correntista.setSaque(Double.parseDouble(JOptionPane.showInputDialog("Valor R$")));
		            break;
		        case 2:
		           	correntista.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Valor R$")));
		            break;
		        case 3:
		            JOptionPane.showMessageDialog(null, correntista.toString());
		            break;
		        case 4:
		            aux=0;
		            JOptionPane.showMessageDialog(null, "Até logo!");
		            break;
		        default:
		            JOptionPane.showMessageDialog(null, "Esta não é uma opção válida!");
			}
		}
	}
}
