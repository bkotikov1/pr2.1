package pr2.pu1;

public class KomplexeZahlen {
	
	public static void main(String[] args) throws Exception {
		KomplexeZahlen c1 = new KomplexeZahlen(22.5, 41.5);
		KomplexeZahlen  c2 = new KomplexeZahlen(3.5,2.5);
		KomplexeZahlKlein1 c3 = new KomplexeZahlKlein1(11.0, 11.0);
		KomplexeZahlKlein2 c4 = new KomplexeZahlKlein2(11.0, 11.0);
		ReelleZahl c5 = new ReelleZahl(11.0, 11.0);
		
//		System.out.println(c3.toString());
		
		
//		System.out.println(c1.toString());
//		System.out.println(c1.add(c2));
//		System.out.println(c3);
		System.out.println(c1);
//		System.out.println(c4);
		
//		System.out.println(c5.toString());
//		System.out.println(c1.multi(c2));
		
//		System.out.println("Add " + c1.add(c2));
	}
	
	private double real;
	private double img;
	
	private double x;
	
	private static double real1;
	private static double img1;
	
	
	
	public KomplexeZahlen(double real, double img) {
		this.img = img;
		this.real = real;
	}
	public double im() {
		return img;
	}
	public double re() {
		return real;
	}
	public static double im1() {
		return img1;
	}
	public static double re1() {
		return real1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x + " = " + real+" + "+img+"i"; 
	}
	/*Dynamisch*/
	public KomplexeZahlen add(KomplexeZahlen kZahlen){
		return new KomplexeZahlen(this.img + kZahlen.img, this.real + kZahlen.real);
	}
	public KomplexeZahlen multi(KomplexeZahlen kZahlen){
		return new KomplexeZahlen(this.img * kZahlen.img, this.real * kZahlen.real);
	}
	/*Statisch*/
	public static KomplexeZahlen add1(){
		return new KomplexeZahlen(img1 + KomplexeZahlen.img1, real1 + KomplexeZahlen.real1);
	}
	public static KomplexeZahlen multi1(){
		return new KomplexeZahlen(img1 * KomplexeZahlen.img1, real1 * KomplexeZahlen.real1);
	}

}
