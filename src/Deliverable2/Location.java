package Deliverable2;

import java.util.Random;

public class Location {

    GetSeed get = new GetSeed();

    int seed = get.getSeed();

    Random random = new Random(seed);
    
    

    public String getRandomLocation() {

        String[] Locations = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave"};

        int idx = random.nextInt(Locations.length);

        String randomLocation = (Locations[idx]);

        String toReturn = randomLocation;

        return toReturn;
    }

}
