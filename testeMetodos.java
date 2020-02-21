package byteBank;

public class testeMetodos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(8293);
		
		Cliente anaCarolina = new Cliente();
		anaCarolina.setNome("Ana carolina lobo da silva");
		conta.setTitular(anaCarolina);
		
		System.out.println(anaCarolina.getNome());
		conta.setTitular(anaCarolina);		
	}
}
