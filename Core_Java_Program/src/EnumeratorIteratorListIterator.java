import java.util.Enumeration;
import java.util.Vector;

class EnumerationCur{
	
}

public class EnumeratorIteratorListIterator {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.addElement("A");
		vector.addElement("B");
		vector.addElement("C");
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
