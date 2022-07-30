
public class Main {
	public static void main(String[]args) {
		Banco santander = new Banco();
		santander.setNome("santander");
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Gabriel");
		Conta conta1 = new ContaCorrente(cliente1);
		santander.addConta(conta1);
		conta1.depositar(200);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("José");
		Conta conta2 = new ContaPoupanca(cliente2);
		santander.addConta(conta2);
		conta1.transferir(130, conta2);
		conta2.sacar(30);
		System.out.println(santander.getListaContas());
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Maria");
		santander.addConta(new ContaCorrente(cliente3) );
		System.out.println(santander.getListaContas());
	}
}
