package rensyuu;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	ArrayList<Object> lista = new ArrayList<Object>();
	ArrayList<Object> listb = new ArrayList<Object>();
	for(int a =1; a<32; a++){
	listb.add(a);
	if(a  == 7){
		List<Integer> listc = new ArrayList<Integer>();
		listc.add(52);
		listb.add((Object)listc);
		break;
	}
	}
	
	
	lista.add(1);
	lista.add((Object)listb);
	lista.add(1);
	
	for(int i =0; i<lista.size(); i++)
	System.out.println(lista.get(i));
}
}
