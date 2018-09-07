package lab4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	ArrayList <ProgramaTV> programas = new ArrayList <ProgramaTV>();
	ArrayList <Serie> serie = new ArrayList <Serie>();
		
		ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
		p.diretor = new Pessoa("Diretor 1", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV("Orgulho e Paixão","Novela");
		p.diretor = new Pessoa("Diretor 2", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV("Marley e eu","Filme");
		p.diretor = new Pessoa("Diretor 3", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
		programas.add(p);
		
		p = new ProgramaTV("Show Ivete Sangalo","Show");
		p.diretor = new Pessoa("Diretor 4", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
		programas.add(p);
		
		Serie s = new Serie("Two and a Half Man","Comedia", 8, (12*8));
		s.diretor = new Pessoa("Diretor 1", "Brasileiro");
		s.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		s.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		serie.add(s);
		
		s = new Serie("Riverdale","Drama", 3, (12*3));
		s.diretor = new Pessoa("Diretor 1", "Brasileiro");
		s.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		s.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		serie.add(s);
	
		s = new Serie("Rick and Morty","Scifi", 3, (24*3));
		s.diretor = new Pessoa("Diretor 1", "Brasileiro");
		s.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		s.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		serie.add(s);
		
		s = new Serie("The X File","Comedia", 12, (12*16));
		s.diretor = new Pessoa("Diretor 1", "Brasileiro");
		s.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		s.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		serie.add(s);
		
					
		for (int i=0;i<programas.size();i++) {
			System.out.println(programas.get(i));
		}	
		for (int i=0;i<serie.size();i++) {
			System.out.println(serie.get(i));
		}
		
	}

}
