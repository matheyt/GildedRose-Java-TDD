package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testLoweringValues()
	{
		Item item = new Item("Test",4,3);
		GildedRose.updateItem(item);
		assertEquals(3,item.getSellIn());
		assertEquals(2,item.getQuality());
	}
	
	
	@Test
	public void testLoweringValuesManyItem()
	{
		ArrayList<Item> items = new ArrayList<Item>(); 
		items.add(new Item("+5 Dexterity Vest", 10, 10)); 
		items.add(new Item("Aged Brie", 0, 0)); 
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(9,items.get(0).getQuality());
		assertEquals(-1,items.get(1).getSellIn());
		assertEquals(-1,items.get(1).getQuality());
	}
	
}