
package service;

import java.util.ArrayList;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	
	public char findFlames(String input1,String input2) {
		char a='F';
		ArrayList <String> s1=new ArrayList <String>();
		ArrayList <String> s2=new ArrayList <String>();
		for(int i=0;i<input1.length();i++) {
			s1.add(input1.substring(i,i+1));
		}
		for(int i=0;i<input2.length();i++) {
			s2.add(input2.substring(i,i+1));
		}int k=0;
		for(int i=0;i<s1.size();i++) {
			System.out.print(s1.get(i)+" ");
			if(s2.indexOf(s1.get(i))!=-1) {		
				s2=flameLength11(s2,s1.get(i));
				k++;
			}
		}
		int flamesLength=s1.size()+s2.size()-k;
		System.out.println(flamesLength);
		ArrayList <String> flames1=new ArrayList<String>();
		flames1.add("f");flames1.add("l");flames1.add("a");flames1.add("m");flames1.add("e");flames1.add("s");
		int index=0;
		while(flames1.size()!=1){
			int col=0;
			while(col<flamesLength-1){
				System.out.print("\nFlames1 "+flames1+" Index: "+index+" "+" col "+col);
				if(index>=flames1.size()-1){
					index=index-flames1.size()+1;
				}else{index++;}
				col++;
			}
			System.out.print("\nI removed from "+index+" element "+flames1.get(index)+"\n");
			flames1.remove(index);
		}
		//System.out.println(flames1);
		//System.out.println(flamesLength);
		//System.out.println(s1+"\n"+s2);
		String s3=flames1.get(0);a=s3.charAt(0);
		System.out.println("Your name is "+input1+"\nYour Partner name is "+input2+"\nyou two are ");
		switch(a) {
		case 'f':System.out.print("Friends.");break;
		case 'l':System.out.print("Lovers.");break;
		case 'a':System.out.print("Attracted to each other.");break;
		case 'm':System.out.print("Married to each other");break;
		case 'e':System.out.print("Enemy");break;
		case 's':System.out.print("Sister");break;
		}
		//a='d';
		return a;

	}
	
	public static ArrayList<String> flameLength11(ArrayList<String> l1,String s2){
		if(l1.indexOf(s2)!=-1){
			l1.remove(s2);
		}
		return l1;
	}
}