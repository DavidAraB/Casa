package Tema6;

public class Ejer03 {

	public static void main(String[] args) {
		opVector();

	}

	private static void opVector() {
		int max=0, min=20, posmax=0, posmin=0;
		int [] vector1 = new int [10];
		for(int i=0;i<vector1.length;++i) {
			vector1 [i]= (int)(Math.random()*20)+1;
			if(vector1[i]<min) {
				min=vector1[i];
				posmin=i;
			}
			if(vector1[i]>max) {
				max=vector1[i];
				posmax=i;
			}
		}
		System.out.println(max+" "+ posmax+ " "+ min+ " "+posmin);
	}

}
