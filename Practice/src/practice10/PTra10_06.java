package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] CAR=new Car[3];

		CAR[0]=new Car();
		CAR[0].serialNo=5000;
		CAR[0].color="GREEN";
		CAR[0].gasoline=50;

		CAR[1]=new Car();
		CAR[1].serialNo=123;
		CAR[1].color="red";
		CAR[1].gasoline=40;

		CAR[2]=new Car();
		CAR[2].serialNo=5000;
		CAR[2].color="BLUE";
		CAR[2].gasoline=35;

		final int distance = 300;
		int n=0;
		int i=0;
		for(int c=0;c<3;c++) {
			while( distance>i) {
				i+=CAR[c].run();
				if(CAR[c].gasoline>=0) {
					n++;
				}else {
					System.out.println("目的地に到着できませんでした。");
					break;
				}
			}

			if(CAR[c].gasoline>=0) {
				System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは"+CAR[c].gasoline+"リットルです");
			}
			i=0;
			n=0;
		}
	}
}