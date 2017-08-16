
public class ReelleZahl extends Zahl implements Comparable {

	private double value; // Wert der reellen Zahl

	public ReelleZahl(double v) { // Konstruktor
		value = v;
	}

	@Override
	public ReelleZahl sub(Zahl zahl) { // Subtraktionsmethode
		// TODO Auto-generated method stub
		ReelleZahl temp = (ReelleZahl) zahl;
		return new ReelleZahl(this.value - temp.value);
	}

	public boolean equals(Object zahl) {
		ReelleZahl temp = (ReelleZahl) zahl;
		return this.value == temp.value; // Vergleichsmethode

	}
	
	public double getValue() {
		return value;
	}

	@Override
	public int compareTo(Object o) { // Vergleichsmethode
		// TODO Auto-generated method stub
		ReelleZahl temp = (ReelleZahl) o;
		if(this.value > temp.value) {
			return -1;
		} else if (this.value < temp.value) {
			return 1;
		} else {
			return 0;
		}
	}

}
