package rensyuu;

import java.util.Calendar;

public class BeerSong{
	public static void main (String [] args){
		Calendar cal = Calendar.getInstance();
		int beernum = 10;
		String word = "bottles";

		while (beernum > 0){
			if(beernum == 1){
				word = "bottle"; //�r�[������{�̎��͒P���`
			} //if���̏I��
			System.out.println(beernum + " " +word + "of beer on the wall");
			System.out.println(beernum + " "+word + "of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
				beernum = beernum -1;

			if(beernum >0){
				System.out.println(beernum +" " +word + "of beer on the wall");
			}//true���̏I��
				else {
				System.out.println("No more bottles of beer on the wall");
				}//else���̏I��
		}//while���̏I��
	}//main�̏I��
}//class�̏I��

//out


