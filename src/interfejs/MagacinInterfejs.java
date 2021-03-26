package interfejs;

import artikal.Artikli;

public interface MagacinInterfejs {
	
	public void dodavanjeArtikla (Artikli a);
	
	public void brisanjeArtikla (Artikli a, int kolicina);
	
	public String nadjiArtikal (int sifra);

}
