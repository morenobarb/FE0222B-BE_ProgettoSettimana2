package progettosettimanale;

public class ArticoloFantasy extends Articolo {

	

	private String descrizione;



public ArticoloFantasy(int id, String titolo, String data, String categoria, String descrizione, String testo, Autore autore, Tags tags) {
		super(id, titolo, data, categoria, testo, autore, tags);
		this.descrizione = descrizione;
	}

///// GETTER AND SETTER 
public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}






}
