import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class tasktesting {
	@SuppressWarnings("null")
	@Test
	public void test() {
		Customer s=new Customer("aneeza","122","1211","islamabad");
		
		  Account object=new Account("saving",2500,s); object.makeDeposite(11000);
		 assertEquals(13500,object.getBal());
		 

		
		  object.transferAmount(3000); assertEquals(10500,object.getBal());
		  
		  
		  object.Withdrawl(5000); assertEquals(5500,object.getBal());
		 
	}
}

