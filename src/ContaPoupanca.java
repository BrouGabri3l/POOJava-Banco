
public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCONTA Poupan�a\n" +super.toString();
	}
}
