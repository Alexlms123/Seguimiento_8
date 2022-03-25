package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Medals;


public class MedalsList {

	private List<Medals> medal;
	
	public MedalsList() {
		medal= new ArrayList<Medals>();
	}
	
	public void loadMedals() throws IOException {
		File file = new File(".\\medals\\medal.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader input = new BufferedReader(fr);
		
		input.readLine();
		
		while (input.ready()) {
			
			String line = input.readLine();
			String [] data = line.split(";");
			
			String Country = data[0];
			int GoldH = Integer.parseInt(data[1]);
			int SilverH = Integer.parseInt(data[2]);
			int BronzeH = Integer.parseInt(data[3]);
			int GoldM = Integer.parseInt(data[4]);
			int SilverM = Integer.parseInt(data[5]);
			int BronzeM = Integer.parseInt(data[6]);
			
			
			addMedals(Country, GoldH, SilverH, BronzeH, GoldM, SilverM, BronzeM);
		}
		
		input.close();
		fr.close();
	}
	
	
	public void addMedals(String Country, int GoldH, int SilverH, int BronzeH, int GoldM, int SilverM, int BronzeM) {
		medal.add(new Medals(Country, GoldH, SilverH, BronzeH, GoldM, SilverM, BronzeM));
	}

	public List<Medals> getMedals(){
		return medal;
	}
	
	public void sortMedalsH(int medal[], int n) {
		boolean inversion = true;
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n -i; j++) {
	    		if (medal[j]> medal[j-1]) {
	    			swap(medal, j, j-1);
	    			inversion = true;
	    		}
	    	}
	    }
	}
	
	void swap(int medal[], int j , int i) {
		int temp = medal[j];
        medal[j] = medal[i];
        medal[i] = temp;
	}
}
