package Demo;


public class DaoPatternDemo {
	public static void main(String[] args)
	{
		
		ProductDao productdao=new ProductDaoImpl();
		for(Product product: productdao.getAllProducts()){
			System.out.println("Product: [Product ID" +product.getPID() +"Product Name" +product.getPName() +"Product Price"+ product.getPPice());
			
		}
		}

	}
