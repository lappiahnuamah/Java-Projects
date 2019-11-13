package football;



public class FootballTeam {
	/*
	-name of the team
	- number of wins
	- number of losses
	*/
	
	private String name;
	private static int numwins;
	private static int numloss;
	
	public FootballTeam (String name, int numwins, int numloss) {
		this.name = name;
		this.numloss = numloss;
		this.numwins = numwins;
	}
	
	public FootballTeam(String name) {
		this(name, 0,0);
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumwins() {
		return numwins;
	}
	
	public int getNumloss() {
		return numloss;
	}
	
	static void increasewins() {
		numwins++;
	}
	
	
	void increaseloss() {
		numloss++;
	}
	
	public static boolean hasGoodRecord() {
		return numwins>numloss;    
	}
	
	public static void main(String[] args) {
		FootballTeam aiti = new FootballTeam("AITI",3,5);
		System.out.println(hasGoodRecord());
		System.out.println("Good Record: "+ aiti.hasGoodRecord());
		increasewins();
		increasewins();
		increasewins();
		System.out.println(hasGoodRecord());
		System.out.println("Good Record: "+ aiti.hasGoodRecord());
	}
		
	
}	
