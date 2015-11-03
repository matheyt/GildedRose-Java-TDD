package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

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

}