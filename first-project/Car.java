
public class Car{
		String brand;
		public Car() {
		    
		    brand = "Ford";
		    
		} //your constructor here
		
		public String getBrand() {
			return brand;
		}		
		public static void main(String[] args) {

					Car ford = new Car();
				
					String brand = ford.getBrand();
					System.out.println(brand);

}
}