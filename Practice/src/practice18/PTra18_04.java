/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		ArrayList<Player> gk=new ArrayList<>();
		ArrayList<Player> df=new ArrayList<>();
		ArrayList<Player> mf=new ArrayList<>();
		ArrayList<Player> fw=new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player ent=new Player();
            	String line= scanner.nextLine();
                String[] list=line.split(",");
                ent.setPosition(list[0]);
                ent.setName(list[1]);
                ent.setCountry(list[2]);
                ent.setTeam(list[3]);
                array.add(ent);

            }
        } catch (FileNotFoundException e) {

        }

        for(int i=array.size()-1;i>=0;i--) {
        	array.get(i).getPosition();
        	if(array.get(i).getPosition().equals("GK")){
        		gk.add(array.get(i));
        	}
        }
        for(int i=array.size()-1;i>=0;i--) {
        	array.get(i).getPosition();
        	if(array.get(i).getPosition().equals("DF")){
        		df.add(array.get(i));
        	}
        }
        for(int i=array.size()-1;i>=0;i--) {
        	array.get(i).getPosition();
        	if(array.get(i).getPosition().equals("FW")){
        		fw.add(array.get(i));
        	}
        }
        for(int i=array.size()-1;i>=0;i--) {
        	array.get(i).getPosition();
        	if(array.get(i).getPosition().equals("MF")){
        		mf.add(array.get(i));
        	}
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        for(int i=0;i<1;i++) {
        	int j= (int) (Math.random() * (gk.size()-1));
        	System.out.println(gk.get(j));
        	gk.remove(j);


        }
        for(int i=0;i<4;i++) {
        	int j= (int) (Math.random() * (df.size()-1));
        	System.out.println(df.get(j));
        	df.remove(j);
        }

        for(int i=0;i<4;i++) {
        int j= (int) (Math.random() * (mf.size()-1));
        	System.out.println(mf.get(j));
        	mf.remove(j);
        }

        for(int i=0;i<2;i++) {
        	int j= (int) (Math.random() * (fw.size()-1));
        	System.out.println(fw.get(j));
        	fw.remove(j);
		}

	}
}
