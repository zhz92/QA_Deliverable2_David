package Deliverable2;

import java.util.Random;


public class Location {
	
	GetSeed get = new GetSeed();
	int seed = get.getSeed();
	
    
	Random random = new Random(seed);
	
    
	public String getRandomLocation () {
		
		
		
//		String toReturn = null;
		//int visitorNum = 1;
//		Location l = new Location();
//		int seed = this.setSeed();
		
//		System.out.println(seed);
		String [] Locations = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave"};

//		System.out.println("*******"+this.setSeed());
		
//        random.setSeed(this.setSeed());
        
		int idx = random.nextInt(Locations.length);
//		System.out.println(Locations.length);
//		System.out.println(idx);
		
		String randomLocation = (Locations[idx]);
		
		//toReturn = "Visitor " + visitorNum++ + " is going to " + random;
		String toReturn = randomLocation;
		//visitorNum ++;
		
		return toReturn;
	}

}
