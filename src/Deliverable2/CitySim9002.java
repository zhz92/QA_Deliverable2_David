package Deliverable2;

import java.util.Random;

public class CitySim9002 {

    public static Random random = new Random();

    private void runGameLoop() {

        Location l = new Location(random);
        Visitor v = new Visitor(l);

        Game g = new Game(v);

        g.run();
    }

    public static void main(String[] args) {

        String errorMessage = "Please enter one integer argument, seed";

        if (new Validator().validateArguments(args)) {

            System.out.println("Welcome to CitySim!  Your seed is " + args[0] + ".");

            GetSeed get = new GetSeed();
            int seed = Integer.parseInt(args[0]);

            random.setSeed(seed);

            Location l = new Location(random);

            get.setSeed(seed);

            CitySim9002 cs = new CitySim9002();
            if (args.length != 0) {
                cs.runGameLoop();
            } else {
                System.out.println("Argument is null!");
            }

        } else {
            System.out.println(errorMessage);

        }

    }

}
