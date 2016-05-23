package rensyuu;

import java.util.Calendar;

public class BeerSong{
	public static void main (String [] args){
		Calendar cal = Calendar.getInstance();
		int beernum = 10;
		String word = "bottles";

		while (beernum > 0){
			if(beernum == 1){
				word = "bottle"; //ビールが一本の時は単数形
			} //if文の終了
			System.out.println(beernum + " " +word + "of beer on the wall");
			System.out.println(beernum + " "+word + "of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
				beernum = beernum -1;

			if(beernum >0){
				System.out.println(beernum +" " +word + "of beer on the wall");
			}//true文の終了
				else {
				System.out.println("No more bottles of beer on the wall");
				}//else文の終了
		}//while文の終了
	}//mainの終了
}//classの終了

//out


