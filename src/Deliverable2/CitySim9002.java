package Deliverable2;

import java.util.Scanner;

public class CitySim9002 {

    private void runGameLoop() {

        Location l = new Location();
        Visitor v = new Visitor(l);

        Game g = new Game(v, l);

        g.run();
    }

    public static void main(String[] args) {

        String errorMessage = "Please enter one integer argument, seed";
        System.out.println("Welcome to CitySim! Please enter your command! (Command should be 'java CitySim9002 n', n is any integer.)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        if (new Validator().validateArguments(inputArray)) {
            String inputForSeed = inputArray[2];

            GetSeed get = new GetSeed();
            int seed = Integer.parseInt(inputForSeed);
            get.setSeed(seed);

            CitySim9002 cs = new CitySim9002();
            if (args.length == 0) {
                cs.runGameLoop();
            } else {
                System.out.println("Argument is not null! Clear the Argument and rerun the program.");
            }

            System.out.println("Simulation Completed! ");
            scanner.close();

        } else {
            System.out.println(errorMessage);

        }

    }

}
