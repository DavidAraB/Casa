package Tema6;

public class Ejer02 {

	
	public static void main(String[] args) {
	int [] vector1 = new int [10];
	int [] vector2 = new int [10];
	int [] vector3 = new int [10];
	for(int i=0;i<vector1.length;++i) {
		vector1 [i]= (int)(Math.random()*20)+1;
		vector2 [i]= (int)(Math.random()*20)+1;
		vector3[i]= vector2[i]+vector1[i];
		System.out.println(vector3[i]);
	}}}

