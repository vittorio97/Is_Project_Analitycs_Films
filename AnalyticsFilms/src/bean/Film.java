package bean;

public class Film {
	public Film (String titoloFilm, String trama, String locandina, String categoria){
		
		this.titoloFilm=titoloFilm;
		this.trama=trama;
		this.locandina=locandina;
		this.categoria=categoria;
	}
	
	/* metodi get e set*/

	public String getTitoloFilm() {
		return titoloFilm;
	}

	public void setTitoloFilm(String titoloFilm) {
		this.titoloFilm = titoloFilm;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public String getLocandina() {
		return locandina;
	}

	public void setLocandina(String locandina) {
		this.locandina = locandina;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	private String titoloFilm, trama, locandina, categoria;
}
