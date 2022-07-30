
public abstract class Conta implements IConta{
	private static final int AGENCIA = 1;
	private static int SEQUENCIAL = 1;
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA;
		this.numero= SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	public int getAGENCIA() {
		return AGENCIA;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void transferir(double valor, IConta contaParaTransferir) {
		this.sacar(valor);
		contaParaTransferir.depositar(valor);
		
	}
	@Override
	public void sacar(double valor) {
		this.saldo-=valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	@Override
	public String toString() {
		return "Agencia: " + this.agencia + "\nNúmero da conta: " + this.numero + "\nCliente: " + this.cliente.getNome() + "\nSaldo: " + this.saldo + "\n";
	}
}
