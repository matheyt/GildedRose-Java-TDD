package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class Item
{
	private String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality)
	{
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSellIn()
	{
		return this.sellIn;
	}

	public void setSellIn(int sellIn)
	{
		this.sellIn = sellIn;
	}

	public int getQuality()
	{
		return this.quality;
	}

	public void setQuality(int quality)
	{
		this.quality = quality;
	}
	
	public void decreaseQuality()
	{
		if (this.getQuality()>0){
			if (this.getSellIn()<0 && this.getQuality()>1)
				this.setQuality(this.getQuality()-2);
			else
				this.setQuality(this.getQuality()-1);
		}
	}
	
	public void decreaseSellIn()
	{
		this.setSellIn(this.getSellIn()-1);
	}

	public void increaseQuality() {
		this.setQuality(this.getQuality()+1);
	}
}
