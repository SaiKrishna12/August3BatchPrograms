package day20;

public class HSBC implements Bank{

	
	public static void main(String[] args) {
		HSBC h=new HSBC();
		h.debit();
		h.credit();
		h.moneyTransfer();
		System.out.println(minBalance);

	}


	public void debit() {
		System.out.println("This is for debitting");
	}
	
	public void credit() {
		System.out.println("Credit policy");
	}
	public void moneyTransfer() {
		System.out.println("Money transfer procedure");
		
	}

}
