package main.java.ui;


import main.java.domain.GraphOplossing;

public class uiOefeningPunt1 {

	public static void main(String[] args) {
		int[][] m = {{0,7,0,6,0,0,0,0},{7,0,4,0,2,6,0,0},{3,4,0,0,0,0,0,0},{6,0,1,0,0,0,0,9},{0,0,5,0,0,3,8,0},{0,6,0,0,3,0,6,0},{0,0,0,0,8,6,0,7},{0,0,0,9,4,0,0,0}};
		
		GraphOplossing g = new GraphOplossing(m);
		
		System.out.println(g.berekenPaden(3));
		
		
	}

}
