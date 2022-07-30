import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> listaContas = new ArrayList<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getListaContas() {
		return listaContas;
	}
	public void addConta(Conta conta) {
		this.listaContas.add(conta);
	}
}
