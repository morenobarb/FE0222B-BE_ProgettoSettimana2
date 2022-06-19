package progettosettimanale;

public class Articolo {
	private int id;
	private String titolo;
	private String data;
	private String categoria;
	private String testo;
	private Autore autore;
	private Tags tags;

/////COSTRUTTORi

	public Articolo(int id, String titolo, String data, String categoria, String testo, Autore autore, Tags tags) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.categoria = categoria;
		this.testo = testo;
		this.autore = autore;
		this.tags = tags;
	}
	
	public Articolo(int id, String titolo, String data, String categoria, String testo, Tags tags) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.categoria = categoria;
		this.testo = testo;
		this.tags = tags;
	}

//////GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Titolo:" + titolo + "\n" + "Data: " + data + "\n" + "Categoria: " + categoria + "\n" + "Autore: "
				+ autore + "\n" + "Tags: " + tags;
	}

}
