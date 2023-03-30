import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int i = 10;
	int j = 20;
}

public class SerializationDemo {

	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println("Serilization");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Others\\abc.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dog);
			objectOutputStream.close();
			System.out.println("Serilization End");
			System.out.println();
			System.out.println("DESerilization");

			FileInputStream fileInputStream = new FileInputStream("C:\\Others\\abc.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Dog dog2 = (Dog) objectInputStream.readObject();
			System.out.println(dog2.j);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
