package Deliverable2;

import java.util.Random;

public class Location {

    Random random;

    public Location(Random random) {
        this.random = random;

    }

    public int getIdx() {
        return random.nextInt(5);
    }

    public String getRandomLocation() {

        String[] Locations = {"The Cathedral of Learning", "Squirrel Hill", "The Point", "Downtown", "Leave"};

        String randomLocation = Locations[getIdx()];

        String toReturn = randomLocation;

        return toReturn;
    }

}
