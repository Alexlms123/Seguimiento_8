package model;


import java.util.Comparator;
import java.util.List;

public class Medals implements Comparable<Medals>, Comparator<Medals>{

	public String Country;
	public int GoldH;
	public int SilverH;
	public int BronzeH;
	public int GoldM;
	public int SilverM;
	public int BronzeM;
	public MedalsList medal;
	
	

	public Medals (String Country, int GoldH, int SilverH, int BronzeH, int GoldM, int SilverM, int BronzeM) {
		
		this.Country=Country;
		this.GoldH=GoldH;
		this.SilverH=SilverH;
		this.BronzeH=BronzeH;
		this.GoldM=GoldM;
		this.SilverM=SilverM;
		this.BronzeM=BronzeM;
		
		 
		
	}
	
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getGoldH() {
		return GoldH;
	}

	public void setGoldH(int goldH) {
		GoldH = goldH;
	}

	public int getSilverH() {
		return SilverH;
	}

	public void setSilverH(int silverH) {
		SilverH = silverH;
	}

	public int getBronzeH() {
		return BronzeH;
	}

	public void setBronzeH(int bronzeH) {
		BronzeH = bronzeH;
	}

	public int getGoldM() {
		return GoldM;
	}

	public void setGoldM(int goldM) {
		GoldM = goldM;
	}

	public int getSilverM() {
		return SilverM;
	}

	public void setSilverM(int silverM) {
		SilverM = silverM;
	}

	public int getBronzeM() {
		return BronzeM;
	}

	public void setBronzeM(int bronzeM) {
		BronzeM = bronzeM;
	}

	public int compareTo(Medals o) {
		return 0;
	}

	public int compare(Medals medal1, Medals medal2) {
		
		return 0;
		
	}
	
	public String toString() {
		return Country+" "+GoldH+" "+SilverH+" "+BronzeH;
	}
	public String toString2() {
		return Country+" "+GoldM+" "+SilverM+" "+BronzeM;
	}

}
