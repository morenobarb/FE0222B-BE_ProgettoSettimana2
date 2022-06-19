package progettosettimanale;

public class ArticoloNoir extends Articolo {
	private String descrizione;

	/////GETTER   E SETTER 
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public ArticoloNoir(int id, String titolo, String data, String categoria, String testo, Autore autore,
			Tags tags, String descrizione) {
		super(id, titolo, data, categoria, testo, autore, tags);
		this.descrizione = descrizione;
	}

	
	
}
