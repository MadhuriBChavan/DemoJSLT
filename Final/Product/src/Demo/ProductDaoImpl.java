package Demo;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
	
	
	List<Product> products;
	
	public ProductDaoImpl() {
		/* products=new ArrayList<Product> ();
		Product product1=new Product(111,"Lakme Kajal",30);
		Product product2=new Product(112,"Lakme Foundation",88);
		Product product3=new Product(113,"Lakme Clenser",99);
		Product product4=new Product(114,"Lakme Blush",30);
		Product product5=new Product(115,"Lakme EyeLiner",30);
		Product product6=new Product(116,"Lakme lipstic",30);
		Product product7=new Product(117,"Lakme Maskara",30);
		Product product8=new Product(118,"Lakme Kajal",30);
		Product product9=new Product(119,"Lakme Kajal",30);
		Product product10=new Product(120,"Lakme Kajal",30);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);
		products.add(product9);
		products.add(product10);*/
	}
		

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	

	@Override
	public Product getProduct(int PID) {
		// TODO Auto-generated method stub
		return products.get(PID);
		
	}

	@Override
	public void UpdateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Product(Product product) {
		// TODO Auto-generated method stub
		
	}

	
}
