package poo;

public class Objetousuario {
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setNome("Ariovaldo");
		usuario1.setPermissao("Sim");
		usuario1.setUsuario("Bora bill da silva");
		usuario1.setId("420");
		usuario1.setSenha("696");
		
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getSenha());
	}
}
		

