

class PopCorn {

	public void teste() {
		System.out.println("testy");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		/* Extends Ways. */
//		PopCorn popCorn = new PopCorn() {
//
//			public void teste() {
//				System.out.println("swit");
//			}
//		};
//		popCorn.teste();
//		PopCorn popCorn2 = new PopCorn();
//		popCorn2.teste();

		Thread thread = new Thread() {

			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("Run");
				}
			}
		};
		
		thread.start();

//		/* Implements Ways. */
//		Runnable runnable = new Runnable() {
//			public void run() {
//
//				for (int i = 0; i < 10; i++) {
//					System.out.println("Run");
//				}
//			}
//		};
//
//		Thread thread = new Thread(runnable);
//		thread.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main");
//		}
	}

}
