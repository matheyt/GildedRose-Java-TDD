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
		items.add(new Item("Robert", 10, 10));
		items.add(new Item("Bonjour", 1, 1));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(9,items.get(0).getQuality());
		assertEquals(0,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());
	}
	
	@Test
	public void testLoweringValuesNegativeSellIn()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Robert", 10, 10));
		items.add(new Item("Bonjour", -2, 10));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(9,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(8,items.get(1).getQuality());
	}
	
	@Test
	public void testLoweringValuesNotNegativeQuality()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Robert", 10, 10));
		items.add(new Item("Bonjour", -2, 0));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(9,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());
	}
	
	@Test
	public void testWhenItemIsAgedBrie()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Aged Brie", 10, 10));
		items.add(new Item("Bonjour", -2, 0));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(11,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());
	}
	
	@Test
	public void testLimiteMaxQuality()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Aged Brie", 10, 50));
		items.add(new Item("Bonjour", -2, 0));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(50,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());
	}
	@Test
	public void testWhenIsSulfuras()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Sulfuras", 10, 30));
		items.add(new Item("Bonjour", -2, 0));
		GildedRose.updateItems(items);
		assertEquals(10,items.get(0).getSellIn());
		assertEquals(30,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());	
	}
	@Test
	public void testWhenIsBackstagePasses()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Backstage passes", 15, 30));
		items.add(new Item("Backstage passes", 10, 30));
		items.add(new Item("Backstage passes", 5, 30));
		items.add(new Item("Backstage passes", 0, 30));
		GildedRose.updateItems(items);
		assertEquals(14,items.get(0).getSellIn());
		assertEquals(29,items.get(0).getQuality());
		assertEquals(9,items.get(1).getSellIn());
		assertEquals(28,items.get(1).getQuality());
		assertEquals(4,items.get(2).getSellIn());
		assertEquals(27,items.get(2).getQuality());
		assertEquals(-1,items.get(3).getSellIn());
		assertEquals(0,items.get(3).getQuality());
	}
	@Test
	public void testWhenIsConjured()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Conjured", 10, 30));
		items.add(new Item("Bonjour", -2, 0));
		GildedRose.updateItems(items);
		assertEquals(9,items.get(0).getSellIn());
		assertEquals(28,items.get(0).getQuality());
		assertEquals(-3,items.get(1).getSellIn());
		assertEquals(0,items.get(1).getQuality());	
	}
}