package Deliverable2;

public class Game {

    private Visitor _visitor = null;
    private Location _location = null;

    public Game(Visitor v, Location l) {
        this._visitor = v;
        this._location = l;
    }

    public void run() {

        int i = 1;
        while (i <= 5) {

            System.out.println(this._visitor.getCurrentVisitorInfo());
            System.out.println("***");
            i++;
        }

    }

}
