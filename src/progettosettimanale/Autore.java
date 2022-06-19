package progettosettimanale;

public  class Autore implements Scrittore {

private int id;
private String nome;
private String cognome;


public Autore(int id, String nome, String cognome) {
	this.id = id;
	this.nome = nome;
	this.cognome = cognome;
}


/////GETTERS AND SETTERS

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCognome() {
	return cognome;
}


public void setCognome(String cognome) {
	this.cognome = cognome;
}


@Override 
public String toString() {
	return nome + " " + cognome;
}

@Override 
public Articolo scriviArticolo( Articolo articolo) {
	articolo.setAutore(this);
	return articolo;
}

}





