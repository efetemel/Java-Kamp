package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben çalıştım");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
