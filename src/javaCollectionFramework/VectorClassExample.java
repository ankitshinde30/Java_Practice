package javaCollectionFramework;
import java.util.*;

public class VectorClassExample {

	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		System.out.println(vc);
		vc.addElement("Ankit");
		vc.addElement("Omkar");
		vc.addElement("Kaushal");
		vc.addElement("Saurabh");
		vc.addLast("Vinit");
		vc.addElement("Vijay");
		vc.addFirst("Sahil");
		vc.add("Vikas");
		
		System.out.println(vc);
		vc.removeElement("Vikas");
		vc.removeElementAt(3);
		System.out.println(vc);
		System.out.println(vc.elementAt(0));
		System.out.println(vc.contains("Saurabh"));
		System.out.println(vc.firstElement());
		System.out.println(vc.lastElement());
		vc.setElementAt("vikas", 4);
		System.out.println(vc);
		

	}

}
