package dp_lab2;

public class Imagine implements Element{
	String nume;

	public Imagine(String nume) {
		super();
		this.nume = nume;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	
	@Override
	public void print()
	{
		System.out.println("Imagine: " + this.nume);
	}
}
