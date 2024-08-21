package poo;

public class Cadeira {
	
	public static void main(String [] args) {
		
		Cadeira1 cadeira1 = new Cadeira1();
		Cadeira1 cadeira2 = new Cadeira1();
		
		cadeira1.setCor("Vermelha");
		cadeira1.setMaterial("Plástico");
		cadeira1.setTipo("Bar");
		cadeira1.setTamanho("Médio");
		
		cadeira2.setCor("RGB");
		cadeira2.setMaterial("Ferro");
		cadeira2.setTipo("Gamer");
		cadeira2.setTamanho("Grande");
		
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getTipo());
		System.out.println(cadeira1.getTamanho());
		
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getTipo());
		System.out.println(cadeira2.getTamanho());

		
		
		
	}

}
