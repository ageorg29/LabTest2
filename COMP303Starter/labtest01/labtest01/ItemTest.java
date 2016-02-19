package labtest01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemTest
{

	ItemDecorator aItemDecorator;
	Item aItem;
	
	@Test
	public void test()
	{
		assertEquals("ITEM-aItem", aItemDecorator.getName());
		assertFalse(aItem.getName().equals(aItemDecorator.getName()));
	}

	
	@Before
	public void setup()
	{
		aItem = new Item("aItem", 1, 2);
		aItemDecorator = new ItemDecorator(aItem);
	}
}
