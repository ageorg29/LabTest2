package labtest01;

public class ItemDecorator implements ItemInterface
{

	ItemInterface aItem;
	
	public ItemDecorator(ItemInterface pItemInterface)
	{
		aItem = pItemInterface;
	}
	
	@Override
	public String getName()
	{
		return "ITEM-" + aItem.getName();
	}

	@Override
	public int getId()
	{
		return aItem.getId();
	}

	@Override
	public int getPrice()
	{
		return aItem.getPrice();
	}

}
