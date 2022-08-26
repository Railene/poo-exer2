package entidades;

public class Funcionario {
	public String nome;
	public double SalarioBruto;
	public double Imposto;
	
	public double SalarioLiq() {
		return SalarioBruto - Imposto;
	}
	
	public void AumentarSalario(double porcentagem) {
		SalarioBruto = SalarioBruto + (SalarioBruto * porcentagem / 100.0);
	}
	@Override
	public  String toString (){
		return nome + ", $" + String.format("%.2f", SalarioLiq());
	}
}
