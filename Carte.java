package dp_lab2;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String name;
	private List<Autor> autori;
	private List<Element> cuprins;
	
	public Carte(String name) {
		this.name=name;
		this.autori=new ArrayList<Autor>();
		this.cuprins= new ArrayList<Element>();
	}
	
	
	public void print()
	{
		System.out.println(this.name);
		for(Autor x : this.autori)
		{
			System.out.println(x.print());
		}
		for(Element x : this.cuprins)
		{
			x.print();
		}
		
	}


	public void AddAutor(Autor a)
	{
		autori.add(a);
	}
	
	public int addContent(Element elm)
	{
		cuprins.add(elm);
		return cuprins.indexOf(elm);
	}
	
	/*public Capitol GetCapitol(int index)
	{
		return cuprins.get(index);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Autor> getAutori() {
		return autori;
	}

	public List<Capitol> getCuprins() {
		return cuprins;
	}

	public void setCuprins(List<Capitol> cuprins) {
		this.cuprins = cuprins;
	}*/
	
	public static void main(String[] args)
	{
		/*long startTime = System.currentTimeMillis();
		Imagine img1 = new Imagine("Pamela Anderson");
		Imagine img2 = new Imagine("Kim Kardashian");
		Imagine img3 = new Imagine("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.addElm(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.addElm(img2);
		playboyS2.addElm(img3);
	    Carte playboy = new Carte("Playboy");

		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");*/
		
		
		
			long startTime = System.currentTimeMillis();
			ImageProxy img1 = new ImageProxy("Pamela Anderson");
			ImageProxy img2 = new ImageProxy("Kim Kardashian");
			ImageProxy img3 = new ImageProxy("Kirby Griffin");
			Section playboyS1 = new Section("Front Cover");
			playboyS1.addElm(img1);
			Section playboyS2 = new Section("Summer Girls");
			playboyS2.addElm(img2);
			playboyS2.addElm(img3);
		    Carte playboy = new Carte("Playboy");
			playboy.addContent(playboyS1);
			playboy.addContent(playboyS2);
			long endTime = System.currentTimeMillis();
			System.out.println("Creation of the content took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing of the section 1 took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing again the section 1 took " + (endTime -
			startTime) + " milliseconds");
	}
	
}
