package ui;

import model.Medals;

public class Main {

	public static void main(String[] args) {
		
		Medals medal = new Medals(null, 0, 0, 0, 0, 0, 0);
		
		System.out.println("----------");
		System.out.println("");
		System.out.println("Medallerio Olimpico de los Hombres");
		medal.toString();
		System.out.println("");
		System.out.println("----------");
		System.out.println("");
		System.out.println("Medallerio Olimpico de las Mujeres");
		medal.toString2();
	}

}
