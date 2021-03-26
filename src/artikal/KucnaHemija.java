package artikal;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikli {

	public GregorianCalendar rokTrajanja;
	
	public KucnaHemija() {
		 super();
		
	
	}

	
	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		if (rokTrajanja.after(new GregorianCalendar()))
			throw new RuntimeException("Rok trajanja ne sme biti posle danasnjeg dana");
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((rokTrajanja == null) ? 0 : rokTrajanja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof KucnaHemija))
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (rokTrajanja == null) {
			if (other.rokTrajanja != null)
				return false;
		} else if (!rokTrajanja.equals(other.rokTrajanja))
			return false;
		return true;
	}
	
	
	

}
