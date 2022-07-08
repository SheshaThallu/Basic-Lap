package model;
public class Laptop 
{
	private String company;
	private Processor processor;

	public Laptop(String company) 
	{
		this.company = company;
	}
	public void use() 
	{
		processor.start();
		System.out.println(company + " Car is moving");
	}
	public void setEngine(Processor processor) {
		this.processor = processor;
	}
	public void setCompany(String company) 
	{
		this.company = company;
	}
}