

//Byte Always
//Short -128 To 127
//Integer -128 To 127 
//Long -128 To 127 
//Character 0 To 127
//Boolean Always
public class Comparision {

	public static void main(String[] args) {

		Float a = 127f;
		Float b = 127f;

		if (a == b) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

}
// O/P  = Fail