import javax.swing.JOptionPane;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		int bool;
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio")));
		funcionario.setInstrucao(JOptionPane.showInputDialog("Digite a instru��o"));
		bool = Integer.parseInt(JOptionPane.showInputDialog("Voc� � motorista.\n0 - Sim | 1 - N�o"));
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
