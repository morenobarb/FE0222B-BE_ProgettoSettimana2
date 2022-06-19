package progettosettimanale;

public class Blog {

	private Articolo[] listaArticoli;
	
	

	public Blog(Articolo[] listaArticoli) {
		this.listaArticoli = listaArticoli;
	}

	/// GETTERS AND SETTERS
	public Articolo[] getListaArticoli() {
		return listaArticoli;
	}

	public void setListaArticoli(Articolo[] listaArticoli) {
		this.listaArticoli = listaArticoli;
	}

	///////// METODO STAMPA TRAMITE ID

	public void stampaArticoliPerId(int id) {
		for (int i = 0; i < listaArticoli.length; i++) {
			if (listaArticoli[i].getId() == id) {
				System.out.println("Articolo numero: " + (i + 1)  + "\nTitolo: " + listaArticoli[i].getTitolo()
						+ "\nCategoria: " + listaArticoli[i].getCategoria() + "\nAutore: "
						+ listaArticoli[i].getAutore() + "\nData: " + listaArticoli[i].getData()
						);
			}
		}
	}

	//// METODO STAMPA DI OGNI ARTICOLO
	public void stampaArticoli() {
		for (int i = 0; i < listaArticoli.length; i++) {
			System.out.println("Articolo numero: " + (i + 1) + "\nTitolo: " + listaArticoli[i].getTitolo()
					+ "\nCategoria: " + listaArticoli[i].getCategoria() + "\nAutore: " + listaArticoli[i].getAutore()
					+ "\nData: " + listaArticoli[i].getData()+"\n" + "#######################");
		}
	}
}
