package rensyuu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rensyuu2{
public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();
	int num = Integer.parseInt(str);
	System.out.println("整数入力");
	
	
	System.out.println(num + "が入力されました");
}
}
