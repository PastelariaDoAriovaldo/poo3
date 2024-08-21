package poo;

public class Obejetocomputador {
	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		
		computador1.setMarca("Acer");
		computador1.setModelo("Notebook");
		computador1.setPerifericos("Teclado, mouse");
		computador1.setCor("Vermelho");
		
		computador2.setMarca("Positivo");
		computador2.setModelo("Notebook");
		computador2.setPerifericos("Teclado, mouse");
		computador2.setCor("Verde");
		
		System.out.println(computador1.getMarca());
		System.out.println(computador1.getModelo());
		System.out.println(computador1.getPerifericos());
		System.out.println(computador1.getCor());
		
		System.out.println(computador2.getMarca());
		System.out.println(computador2.getModelo());
		System.out.println(computador2.getPerifericos());
		System.out.println(computador2.getCor());
		
		
		

	}
}
