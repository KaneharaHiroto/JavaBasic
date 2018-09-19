package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

		for(int i=1;i<=25;i++) {
			System.out.print("□");

			switch(i) {
				case 6:

					continue;

				case 7:
				continue;

			}
			for(int j=1;j<=25;j++) {
			System.out.print("■");

			if(i%5==0) {
				System.out.println();
			}


		}

		}
	}
}
