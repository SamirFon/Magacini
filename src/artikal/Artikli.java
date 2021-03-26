package artikal;



public abstract class Artikli {
	
	
	private String naziv;
	private String opis;
	private int sifra;
	private int kolicina;
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv==null || naziv.equals(""))
			throw new RuntimeException("Naziv ne sme biti null ili prazan string");
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if (opis==null || opis.equals(""))
			throw new RuntimeException("Opis ne sme biti null ili prazan string");
		this.opis = opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if (sifra<=0)
			throw new NullPointerException("Sifra ne me biti nula ili manja od nule"); 
			this.sifra = sifra;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if (kolicina<=0)
			throw new NullPointerException("Kolicina ne sme biti nula ili manja od nule");
		this.kolicina = kolicina;
	}
	@Override
	public String toString() {
		return "Artikli [naziv=" + naziv + ", opis=" + opis + ", sifra=" + sifra + ", kolicina=" + kolicina + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Artikli))
			return false;
		Artikli other = (Artikli) obj;
		if (kolicina != other.kolicina)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	

	

}
