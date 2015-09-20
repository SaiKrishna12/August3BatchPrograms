package day20;

public class BOA implements Bank{

	
	public static void main(String[] args) {
		BOA b=new BOA();
		b.debit();
		b.credit();
		b.moneyTransfer();

	}

	@Override
	public void debit() {
		System.out.println("abc");
		
	}

	@Override
	public void credit() {
		System.out.println("XYZ");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("DDDD");
		
	}

}
