package Demo;
public class Product {

	private int PID;
	private String PName;
	private float PPice;
	
	Product(int PID,String PName,float PPrice)
	{
		this.PID=PID;
		this.PName=PName;
		this.PPice=PPrice;
		
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public float getPPice() {
		return PPice;
	}

	public void setPPice(float pPice) {
		PPice = pPice;
	}
	
}
