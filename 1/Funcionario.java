import javax.swing.JOptionPane;


public class Funcionario {
	
	private String nome;
	private double salario;
	private String instrucao;
	private boolean motorista;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salario, String instrucao, boolean motorista) {
		this.nome = nome;
		this.salario = salario;
		this.instrucao = instrucao;
		this.motorista = motorista;
	}
	
	public String toString() {
		return "Nome: " + nome +
				"\nSalário: " + salario +
				"\nInstrução: " + instrucao + 
				"\nMotorista: " + motorista;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getInstrucao() {
		return instrucao;
	}
	public void setInstrucao(String instrucao){
		this.instrucao = instrucao;
	}
	public boolean getMotorista() {
		return motorista;
	}
	public void setMotorista(boolean motorista){
		this.motorista = motorista;
	}
	
	public void calSalario (){
		if (this.motorista==true){
			this.salario = this.salario * 1.10;
		}
	}
	
	public void alteraInstrucao (){
		String novo;
		novo = JOptionPane.showInputDialog("Digite a nova intrução");
		this.instrucao = novo;
		this.salario = this.salario * 1.15;
	}
}
