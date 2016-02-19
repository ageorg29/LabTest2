package labtest01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class labtestTest
{

	private Inventory aInventory;
	
	@Test
	public void test()
	{
		assertEquals("inv", aInventory.getName());
	}
	
	@Before
	public void setup()
	{
		aInventory = new Inventory("inv");
	}
	
	

}
