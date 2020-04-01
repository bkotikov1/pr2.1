package pr2.pu1;

import javax.security.sasl.RealmCallback;

public class ReelleZahl extends KomplexeZahlen{

	public ReelleZahl(double real, double img) {
		super(real, 0.0);
		
	}
	
	@Override
	public String toString() {
		
		return "Reele Zahl = " + re();
	}
	public ReelleZahl add(ReelleZahl rz) {
		return new ReelleZahl(re() + rz.re(), im() + rz.im());
	}
	public ReelleZahl multi(ReelleZahl rz) {
		return new ReelleZahl(re() * rz.re(), im() * rz.im());
	}
	
	public static ReelleZahl add1() {
		return new ReelleZahl(re1() + re1(), im1() + im1());
	}
	public static ReelleZahl multi1() {
		return new ReelleZahl(re1() * re1(), im1() * im1());
	}

}
