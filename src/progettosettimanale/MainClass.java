package progettosettimanale;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		////// CREAZIONE AUTORI
		Autore fabriziocarli = new Autore(1, "Fabrizio", "Carli");
		Autore carloconti = new Autore(2, "Carlo", "Conti");
		Autore morenobarbieri = new Autore(3, "Moreno", "Barbieri");
		Autore salvatoresalvi = new Autore(4, "Salvatore", "Salvi");

		/////// CREAZIONE TAGS

		String[] tagPolitica = { "manovra", "politica", "referendum", "astensione", "consultazioni", "ministri" };
		String[] tagSport = { "calcio", "tennis", "tifosi", "sky", "tessera del tifoso", "ultras", "biglietti" };
		String[] tagFantasy = { "magia", "incantesimi", "streghe", "troll" };
		String[] tagNoir = { "giallo", "caso", "thriller", "noir" };

		Tags tagsPolitica = new Tags(tagPolitica);
		Tags tagsSport = new Tags(tagSport);
		Tags tagsFantasy = new Tags(tagFantasy);
		Tags tagsNoir = new Tags(tagNoir);
		

		///////// CREAZIONE ARTICOLI

		Articolo risultatiReferendum = new Articolo(1, "Risultati referendari", "giugno 2022", "politica",
				"Analisi voto alle urne", tagsPolitica);

		Articolo campionatoSerieA = new Articolo(2, "Campionato di serie A", "maggio 2022", "calcio",
				"Analisi campionato di calcio concluso con la retrocessione del Genoa", tagsSport);
		Articolo ilSignoreDegliAnelli = new ArticoloFantasy(3, "Il signore degli Anelli", "aprile 2020", "Fantasy",
				"Spunti di riflessione sull opera di Tolkien", null, carloconti, tagsFantasy);
		Articolo investigatoreBerlucchi = new ArticoloNoir(4, "I casi dell' investigatore Berlucchi", "gennaio 2020",
				"Noir", "Racconti noir", salvatoresalvi, tagsNoir, null);

		Articolo[] listaArticoliBlog = { risultatiReferendum, campionatoSerieA, ilSignoreDegliAnelli,
				investigatoreBerlucchi };

		risultatiReferendum.setAutore(fabriziocarli);
		campionatoSerieA.setAutore(morenobarbieri);
		
		Blog blog = new Blog(listaArticoliBlog);
		startBlog(blog);

	}

	public static void startBlog(Blog blog) {
		System.out
				.println("\nPremi 1  tutti gli Articoli o premi 2 per la ricerca tramite ID...");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			blog.stampaArticoli();
			break;

		case 2:
			System.out.println("Scegli ID Articolo ovvero un numero compreso tra 1 e 4: ");
			int n2 = scanner.nextInt();
			if (n2 > blog.getListaArticoli().length || n2 <= 0) {
				System.out.println("Articolo non esistente");
			} else {
				blog.stampaArticoliPerId(n2);
			}
			break;

		default:
			System.out.println("Input non valido");
		}
	}

}
