package heranca;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro ch = new Cachorro("Rex", 1);
		Cavalo cv = new Cavalo("Pé de pano", 3);
		Preguica pg = new Preguica("Lentinha", 2);
		
		ch.imprimirInfo();
		ch.emitirSom();
		ch.locomover();
		
		cv.imprimirInfo();
		cv.emitirSom();
		cv.locomover();
		
		pg.imprimirInfo();
		pg.emitirSom();
		pg.locomover();

	}
}