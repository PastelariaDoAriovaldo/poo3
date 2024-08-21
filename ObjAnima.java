package poo;

public class ObjAnima {
	public static void main(String[] args) {
		
		animal animal1 = new animal();
		animal animal2 = new animal();
		animal animal3 = new animal();
		animal animal4 = new animal();
		animal animal5 = new animal();
		animal animal6 = new animal();
		animal animal7 = new animal();
		animal animal8 = new animal();
		
		animal1.setNome("Calango");
		animal1.setReino("Animalia");
		animal1.setFilo("Chordata");
		animal1.setClasse("Reptilia");
		animal1.setOrdem("Squamata");
		animal1.setFamilia("Sphaerodactylidae");
		animal1.setGenero("Chatogekko");
		animal1.setEspecies("C. amazonicus");
		
		animal2.setNome("Cleide");
		animal2.setReino("Animalia");
		animal2.setFilo("Chordata");
		animal2.setClasse("Mammalia");
		animal2.setOrdem("Artiodactyla");
		animal2.setFamilia("Bovidae");
		animal2.setGenero("Bos");
		animal2.setEspecies("Bos Taurus");
		
		animal3.setNome("Bezerro");
		animal3.setReino("Animalia");
		animal3.setFilo("Chordata");
		animal3.setClasse("Mammalia");
		animal3.setOrdem("Artiodactyla");
		animal3.setFamilia("Bovidae");
		animal3.setGenero("Bos");
		animal3.setEspecies("Bos Taurus");
	
		animal4.setNome("Cabra");
		animal4.setReino("Animalia");
		animal4.setFilo("Chordata");
		animal4.setClasse("Mammalia");
		animal4.setOrdem("Artiodactyla");
		animal4.setFamilia("Bovidae");
		animal4.setGenero("Capra");
		animal4.setEspecies("C. Aegagrus");
		
		animal5.setNome("Cão");
		animal5.setReino("Animalia");
		animal5.setFilo("Chordata");
		animal5.setClasse("Mammalia");
		animal5.setOrdem("Carnivora");
		animal5.setFamilia("Canidae");
		animal5.setGenero("Canis");
		animal5.setEspecies("C. Lupus");
		
		animal6.setNome("Rabbit");
		animal6.setReino("Animalia");
		animal6.setFilo("Chordata");
		animal6.setClasse("Mammalia");
		animal6.setOrdem("Lagomorpha");
		animal6.setFamilia("Leporidae");
		animal6.setGenero("Oryctolagus");
		animal6.setEspecies("O. Cuniculus");
		
		animal7.setNome("Pinto");
		animal7.setReino("Animalia");
		animal7.setFilo("Chordata");
		animal7.setClasse("Aves");
		animal7.setOrdem("Galliformes");
		animal7.setFamilia("Phasianidae");
		animal7.setGenero("Gallus");
		animal7.setEspecies("G. Gallus");
		
		animal8.setNome("Cocó");
		animal8.setReino("Animalia");
		animal8.setFilo("Chordata");
		animal8.setClasse("Aves");
		animal8.setOrdem("Galliformes");
		animal8.setFamilia("Phasianidae");
		animal8.setGenero("Gallus");
		animal8.setEspecies("G. Gallus");
		
		System.out.println("Nome:" +animal1.getNome());
		System.out.println("Reino:" +animal1.getReino());
		System.out.println("Filo:" +animal1.getFilo());
		System.out.println("Classe:" +animal1.getClasse());
		System.out.println("Ordem:" +animal1.getOrdem());
		System.out.println("Familia:" +animal1.getFamilia());
		System.out.println("Genero:" +animal1.getGenero());
		System.out.println("Especies:" +animal1.getEspecies());
		System.out.println(animal1.Sons());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal2.getNome());
		System.out.println("Reino:" +animal2.getReino());
		System.out.println("Filo:" +animal2.getFilo());
		System.out.println("Classe:" +animal2.getClasse());
		System.out.println("Ordem:" +animal2.getOrdem());
		System.out.println("Familia:" +animal2.getFamilia());
		System.out.println("Genero:" +animal2.getGenero());
		System.out.println("Especies:" +animal2.getEspecies());
		System.out.println(animal2.Sons());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal3.getNome());
		System.out.println("Reino:" +animal3.getReino());
		System.out.println("Filo:" +animal3.getFilo());
		System.out.println("Classe:" +animal3.getClasse());
		System.out.println("Ordem:" +animal3.getOrdem());
		System.out.println("Familia:" +animal3.getFamilia());
		System.out.println("Genero:" +animal3.getGenero());
		System.out.println("Especies:" +animal3.getEspecies());
		System.out.println(animal3.Sons());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal4.getNome());
		System.out.println("Reino:" +animal4.getReino());
		System.out.println("Filo:" +animal4.getFilo());
		System.out.println("Classe:" +animal4.getClasse());
		System.out.println("Ordem:" +animal4.getOrdem());
		System.out.println("Familia:" +animal4.getFamilia());
		System.out.println("Genero:" +animal4.getGenero());
		System.out.println("Especies:" +animal4.getEspecies());
		System.out.println(animal4.Sons());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal5.getNome());
		System.out.println("Reino:" +animal5.getReino());
		System.out.println("Filo:" +animal5.getFilo());
		System.out.println("Classe:" +animal5.getClasse());
		System.out.println("Ordem:" +animal5.getOrdem());
		System.out.println("Familia:" +animal5.getFamilia());
		System.out.println("Genero:" +animal5.getGenero());
		System.out.println("Especies:" +animal5.getEspecies());
		System.out.println(animal5.Comer());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal6.getNome());
		System.out.println("Reino:" +animal6.getReino());
		System.out.println("Filo:" +animal6.getFilo());
		System.out.println("Classe:" +animal6.getClasse());
		System.out.println("Ordem:" +animal6.getOrdem());
		System.out.println("Familia:" +animal6.getFamilia());
		System.out.println("Genero:" +animal6.getGenero());
		System.out.println("Especies:" +animal6.getEspecies());
		System.out.println(animal6.Andar());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal7.getNome());
		System.out.println("Reino:" +animal7.getReino());
		System.out.println("Filo:" +animal7.getFilo());
		System.out.println("Classe:" +animal7.getClasse());
		System.out.println("Ordem:" +animal7.getOrdem());
		System.out.println("Familia:" +animal7.getFamilia());
		System.out.println("Genero:" +animal7.getGenero());
		System.out.println("Especies:" +animal7.getEspecies());
		System.out.println(animal7.Defecar());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Nome:" +animal8.getNome());
		System.out.println("Reino:" +animal8.getReino());
		System.out.println("Filo:" +animal8.getFilo());
		System.out.println("Classe:" +animal8.getClasse());
		System.out.println("Ordem:" +animal8.getOrdem());
		System.out.println("Familia:" +animal8.getFamilia());
		System.out.println("Genero:" +animal8.getGenero());
		System.out.println("Especies:" +animal8.getEspecies());
		System.out.println(animal8.Comer());
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX");
	}

}
