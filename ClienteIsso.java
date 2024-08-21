package poo;

public class ClienteIsso {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.setId(420);
		cliente1.setNome("Clóvis Basílio dos Santos");
		cliente1.setTelefone("(55)+15 997614206969");
		cliente1.setCpf("37744744831");
		cliente1.setRg("789456321");

		cliente2.setId(696);
		cliente2.setNome("Shaolin Matador de Porco");
		cliente2.setTelefone("(234)+71 9912312425 ");
		cliente2.setCpf("89744725831");
		cliente2.setRg("368945641");
		
		System.out.println("id: " + cliente1.getId());
		System.out.println("nome: " + cliente1.getNome());
		System.out.println("telefone: " + cliente1.getTelefone());
		System.out.println("cpf: " + cliente1.getCpf());
		System.out.println("rg: " + cliente1.getRg());
		
		System.out.println("id: " + cliente2.getId());
		System.out.println("nome: " + cliente2.getNome());
		System.out.println("telefone: " + cliente2.getTelefone());
		System.out.println("cpf: " + cliente2.getCpf());
		System.out.println("rg: " + cliente2.getRg());
	}
}
