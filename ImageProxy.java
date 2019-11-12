package dp_lab2;

import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element {
	private String nume;
	private Imagine realImage;

	public ImageProxy(String nume) {
		super();
		this.nume =nume;
		
		
	}	
	public void print()
	{  
  
	if(realImage==null )	
	  realImage=new Imagine(this.nume);
		realImage.print();
	
	}
	public void accept(Visitor a) {
		a.visit(this);
	}
}
