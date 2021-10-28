package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(98);
		System.out.println("gpay account no is"+ gpayAccount.getObj());
	}

}
