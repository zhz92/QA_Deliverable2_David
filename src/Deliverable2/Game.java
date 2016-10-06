package Deliverable2;

public class Game {

    private Visitor _visitor = null;

    public Game(Visitor v) {
        this._visitor = v;

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
