package Ex1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criando autor 1
		Compositor autor1 = new Compositor("Gabriel G. Oliveira");
		autor1.setNacionalidade("Brasileiro");
		
		//criando autor 2
		Compositor autor2 = new Compositor("Renato Vitor");
		autor2.setNacionalidade("Brasileiro");
		
		Musica musica1 = new Musica("Stairway to Heaven");
		Musica musica2 = new Musica("Wish you were here");
		musica1.tipo = "Rock";
		musica2.tipo = "Rock";
		musica1.ano = 1970;
		musica2.ano = 1975;
		musica1.setAutor(autor1);
		musica1.setCoAutor(autor2);
		musica2.setAutor(autor1);
		musica2.setCoAutor(autor2);
		musica1.imprimirMusica();
		System.out.printf("\n\n");
		musica2.imprimirMusica();
	}

}
