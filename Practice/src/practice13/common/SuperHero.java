package practice13.common;

public class SuperHero extends Hero{
	private practice13.common.Item equipment;
	public int attack(){
		return super.attack() +this.equipment.getAdditionalDamage();

	}
		public Item getequipment() {
		return this.equipment;
	}

	public void setequipment(Item  equipment){
		this.equipment=equipment;
	}

}
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
