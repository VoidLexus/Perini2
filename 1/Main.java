import javax.swing.JOptionPane;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		int bool;
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário")));
		funcionario.setInstrucao(JOptionPane.showInputDialog("Digite a instrução"));
		bool = Integer.parseInt(JOptionPane.showInputDialog("Você é motorista.\n0 - Sim | 1 - Não"));
		if (bool==0){
			funcionario.setMotorista(true);
		}
		
		JOptionPane.showMessageDialog(null, funcionario.toString());
		
		funcionario.calSalario();
		JOptionPane.showMessageDialog(null, funcionario.toString());
		funcionario.alteraInstrucao();
		JOptionPane.showMessageDialog(null, funcionario.toString());
	}

}
