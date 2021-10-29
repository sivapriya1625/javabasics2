package generics;

public class GenericsDemo {
	public static void main(String[] args) {
		generics.Account<Integer> gpayAccount = new generics.Account<>();
		gpayAccount.setObj(98);
		System.out.println("gpay account no is"+ gpayAccount.getObj());
	}

}
