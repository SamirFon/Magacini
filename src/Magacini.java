import java.util.LinkedList;

import artikal.Artikli;
import interfejs.MagacinInterfejs;

public class Magacini  implements MagacinInterfejs{
	
	LinkedList<Artikli> artikli = new LinkedList<Artikli>();

	@Override
	public void dodavanjeArtikla(Artikli a) {
		
		if (!artikli.contains(a))
		
		artikli.add(a);
	}

	@Override
	public void brisanjeArtikla(Artikli a, int kolicina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String nadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
