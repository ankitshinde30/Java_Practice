package Oops.Polymorphism;

class RBI{
	int getRateofInterst() {
		return 0;
	}
}

class SBI extends RBI{
	@Override
	int getRateofInterst() {
		return 12;
		}
}

class ICICI extends RBI{
	@Override
	int getRateofInterst() {
		return 15;
		}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		
		SBI sb= new SBI();
		System.out.println(" The rate of Interest Of SBI: "+sb.getRateofInterst());
		ICICI cb= new ICICI();
		System.out.println(" The rate of Interest Of ICICI: "+cb.getRateofInterst());

	}

}
