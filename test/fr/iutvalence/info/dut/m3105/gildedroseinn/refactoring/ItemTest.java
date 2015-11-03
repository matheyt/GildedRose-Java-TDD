package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest
{
	@Test
	public void testItemGetName()
	{
		Item item = new Item("Test",4,3);
		assertEquals("Test",item.getName());
		item.setName("test1");
		assertEquals("test1",item.getName());
	}
	
	@Test
	public void testItemGetSellIn()
	{
		Item item = new Item("Test",4,3);
		assertEquals(4,item.getSellIn());
		item.setSellIn(3);
		assertEquals(3,item.getSellIn());
	}
	
	@Test
	public void testItemGetQuality()
	{
		Item item = new Item("Test",4,3);
		assertEquals(3,item.getQuality());
		item.setQuality(4);
		assertEquals(4,item.getQuality());
	}
}