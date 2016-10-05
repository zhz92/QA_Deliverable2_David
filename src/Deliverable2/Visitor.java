package Deliverable2;

public class Visitor {

    private Location _location = new Location();
    int i = 1;

    public String getVisitorType(int i) {

        String[] Visitors = {"Student", "Business Person", "Professor", "Student", "Blogger"};

        String toReturn = Visitors[i - 1];

        return toReturn;
    }

    public int getVisitorNum(int i) {

        if (i > 5) {
            return 0;
        } else if (i < 1) {
            return 0;
        } else {

            return i;
        }
    }

    public Visitor(Location l) {
        this._location = l;
    }

    public String getRandomLocation() {

        return _location.getRandomLocation();
    }

    public String getCurrentVisitorInfo() {
        String toReturn = "";
        String randomLocation;

        String VisitorInfo = "Visitor " + getVisitorNum(i) + " is a " + getVisitorType(i) + ".\n";
        randomLocation = getRandomLocation();

        while (randomLocation.equals("Leave")) {
            randomLocation = getRandomLocation();
        }

        do {
            String VisitorLocation = "Visitor " + getVisitorNum(i) + " is going to " + randomLocation + ".\n";

            /**
             * ************Fun-Preference***************
             */
            // Student Preference
            if (getVisitorType(i).equals("Student") && randomLocation.equals("The Cathedral of Learning")) {
                String StudentDislike = "Visitor " + getVisitorNum(i) + " did not like " + randomLocation + ".\n";

                toReturn = toReturn.concat(VisitorLocation + StudentDislike);
            } else if (getVisitorType(i).equals("Student")) {
                String StudentLike = "Visitor " + getVisitorNum(i) + " did like " + randomLocation + ".\n";
                toReturn = toReturn.concat(VisitorLocation + StudentLike);
            } // Business Person Preference
            else if (getVisitorType(i).equals("Business Person") && randomLocation.equals("The Cathedral of Learning")) {
                String BusinessPersonDislike = "Visitor " + getVisitorNum(i) + " did not like " + randomLocation + ".\n";

                toReturn = toReturn.concat(VisitorLocation + BusinessPersonDislike);
            } else if (getVisitorType(i).equals("Business Person") && randomLocation.equals("The Point")) {
                String BusinessPersonDislike = "Visitor " + getVisitorNum(i) + " did not like " + randomLocation + ".\n";

                toReturn = toReturn.concat(VisitorLocation + BusinessPersonDislike);
            } else if (getVisitorType(i).equals("Business Person")) {
                String BusinessPersonLike = "Visitor " + getVisitorNum(i) + " did like " + randomLocation + ".\n";
                toReturn = toReturn.concat(VisitorLocation + BusinessPersonLike);
            } // Professor Preference
            else if (getVisitorType(i).equals("Professor")) {
                String ProfessorLike = "Visitor " + getVisitorNum(i) + " did like " + randomLocation + ".\n";
                toReturn = toReturn.concat(VisitorLocation + ProfessorLike);
            } // Blogger Preference
            else if (getVisitorType(i).equals("Blogger")) {
                String BloggerDislike = "Visitor " + getVisitorNum(i) + " did not like " + randomLocation + ".\n";

                toReturn = toReturn.concat(VisitorLocation + BloggerDislike);
            }

            /**
             * *************Fun-Preference END*****************
             */
            randomLocation = getRandomLocation();

        } while (randomLocation != "Leave");

        String leaveCity = "Visitor " + getVisitorNum(i) + " has left the city.";

        String result = VisitorInfo + toReturn + leaveCity;

        i++;

        return result;
    }
}
