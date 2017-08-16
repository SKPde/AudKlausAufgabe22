
public class ReellerAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReelleZahl x = new ReelleZahl(0.1);
		ReelleZahl y = new ReelleZahl(10);
		
		while(y.compareTo(new ReelleZahl(0)) < 0) {
			y = y.sub(x);
			System.out.println("Durchlauf: " + y.getValue());
		}
		
		if(! y.equals(new ReelleZahl(0))) {
			System.out.println("Rundungsfehler");
		}
	}

}
