package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item item)
	{
	if (item.getName()!="Sulfuras")
		{	
			item.decreaseSellIn();
			switch (item.getName())
			{
			case "Aged Brie":
				{
					updateAgedBrie(item);
					break;
				}
			case "Backstage passes":
			{
				updateBackstagePasses(item);
				break;
				}
			default:
			{
				updateCommonItem(item);
				break;
			}
			
			}
			
	
		}

}

	private static void updateCommonItem(Item item) {
		if (item.getSellIn()<0)
			item.decreasequalitytwice();
		else
			item.decreaseQualityonce();
	}

	private static void updateBackstagePasses(Item item) {
		if (item.getSellIn()>10)
		{
			item.decreaseQualityonce();
		}
		else{
			
			if (item.getSellIn()<11 && item.getSellIn()>5)
			{
				item.decreasequalitytwice();
			}
			else
			{
				if (item.getSellIn()<=5 && item.getSellIn()>0)
				{
				item.decreasequalitythirdth();
				}
				else 
					if(item.getSellIn()<=0) 
						item.setQualityAtZero();
		}}
	}

	private static void updateAgedBrie(Item item) {
		if (item.getQuality()<50)
			item.increaseQuality();
	}
}