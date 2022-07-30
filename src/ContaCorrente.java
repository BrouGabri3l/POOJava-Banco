
public class ContaCorrente extends Conta{
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nCONTA CORRENTE\n" + super.toString();
	}
}
