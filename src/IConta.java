
public interface IConta {
	void sacar(double valor);
	void transferir(double valor, IConta contaParaTransferir);
	void depositar(double valor);
}
