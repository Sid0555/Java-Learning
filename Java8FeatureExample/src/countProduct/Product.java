package countProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {

	String productName;
	int productQuantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public Product(String productName, int productQuantity) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
	}
	
	
	
	}
	

 