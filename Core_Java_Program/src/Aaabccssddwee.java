
/* Consecutive repeated element */
public class Aaabccssddwee {
	public static void main(String[] args) {

		String str = "aabdcclcxyyy sddd DDDD sbag aGSGA FFF sss sh axhh";
		char[] ch = str.toCharArray();

		char[] repetated = new char[ch.length];
		boolean isduplicate = false;
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			isduplicate = false;
			count = 1;
			if (repetated[i] == 'Y') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					ch[j] = 'Y';
					System.out.print(ch[i]);
					isduplicate = true;
					count++;
				} else {
					break;
				}
			}
			if (isduplicate) {
				System.out.println(ch[i] + " " + count);
			}

		}
	}
}
