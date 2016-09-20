package Demo;

import java.util.List;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product getProduct(int PID);
	public void UpdateProduct(Product product);
	public void Product(Product product);
	void DeleteProduct(Product product);

}
