package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		//sc1:
		shop.login("noman@gmail.com", "noman@123")
		     .search("Tshirt")
		         .addToCart("Tshirt")
		             .doPayement("1212 1212 1212 1212", 123)
		                    .genrateOrder()
		                          .logOut();
		System.out.println("-----------");
		//sc2: 
		shop.login("abc@gmail.com", "abc@123")
		      .search("mackbook")
		            .addToCart("mackbook ")
		                .logOut();
		
		System.out.println("-----------");
		//sc3
		shop.login("ba@gmail.com", "ba@321")
		      .doPayement("abc@123")
		          .genrateOrder()
		                .logOut();
		System.out.println("-----------");
		//sc4: 
		shop.login("abc@gmail.com", "ba@123")
		      .logOut();
		System.out.println("-----------");
		//sc5:
		shop.login("abc@gmail.com", "ba@123")
	           .logOut();
		shop.login("abc@gmail.com", "ba@123")
	      .logOut();
	}

}
