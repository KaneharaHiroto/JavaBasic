package practice13.common;

public class Item {

	private String name;
	private int AdditionalDamage;

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public int getAdditionalDamage() {
		return AdditionalDamage;
	}

	public void setAdditionalDamage(int AdditionalDamage) {
		this.AdditionalDamage = AdditionalDamage;
	}

	public Item(String name,int AdditionalDamage ){
		this.name=name;
		this.AdditionalDamage=AdditionalDamage;
	}


}
