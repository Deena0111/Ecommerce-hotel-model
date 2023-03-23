package com.ecommerce.DDCart.global;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.DDCart.model.Product;

public class GlobalData {
	public static List<Product>cart;
	
	static {
		cart=new ArrayList<Product>();
	}

}
