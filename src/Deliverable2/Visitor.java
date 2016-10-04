package Deliverable2;

public class Visitor {
	
	private Location _location = new Location ();
//	String [] Visitors = {"Student", "Business Person", "Professor", "Student", "Blogger" };
	int i = 1;
        public String getVisitorType () {
            
            String [] Visitors = {"Student", "Business Person", "Professor", "Student", "Blogger" };
            
            String toReturn = Visitors [i-1];
            
            return toReturn;
        }
        
        public int getVisitorNum () {
            
            int toReturn = i;
           
            return toReturn;
            
        }
	
//	int i = 1;

	
	public Visitor (Location l) {
		this._location = l;
	}
        
	
	public String getCurrentVisitorInfo () {
		String toReturn = "";
		String randomLocation  = null;
		

		String VisitorInfo = "Visitor " + getVisitorNum() + " is a " + getVisitorType() + ".\n"; 
		randomLocation = _location.getRandomLocation();
		
//		System.out.println(randomLocation);
		
		while (randomLocation == "Leave") {
			randomLocation = _location.getRandomLocation();
		}
		

		

			do {
				String VisitorLocation = "Visitor " + getVisitorNum() + " is going to " + randomLocation + ".\n";
			
				
				/**************Fun-Preference****************/
				// Student Preference
				if (getVisitorType().equals("Student") && randomLocation.equals("The Cathedral of Learning")) {
					String StudentDislike = "Visitor " + getVisitorNum() + " did not like " + randomLocation + ".\n";
					
					toReturn = toReturn.concat(VisitorLocation + StudentDislike);
				}
				else if (getVisitorType().equals("Student")){
					String StudentLike = "Visitor " + getVisitorNum() + " did like " + randomLocation + ".\n";
					toReturn =   toReturn.concat(VisitorLocation + StudentLike);
				}
				
				// Business Person Preference
				else if (getVisitorType().equals("Business Person") && randomLocation.equals("The Cathedral of Learning")) {
					String BusinessPersonDislike = "Visitor " +getVisitorNum() + " did not like " + randomLocation + ".\n";
					
					toReturn =  toReturn.concat(VisitorLocation + BusinessPersonDislike) ;
				}
				
				else if (getVisitorType().equals("Business Person") &&  randomLocation.equals("The Point")) {
					String BusinessPersonDislike = "Visitor " + getVisitorNum() + " did not like " + randomLocation + ".\n";
					
					toReturn =  toReturn.concat(VisitorLocation + BusinessPersonDislike) ;
				}
				
				else if (getVisitorType().equals("Business Person" )){
					String BusinessPersonLike = "Visitor " + getVisitorNum() + " did like " + randomLocation + ".\n";
					toReturn =  toReturn.concat(VisitorLocation + BusinessPersonLike) ;
				}
				
				// Professor Preference
				else if (getVisitorType().equals("Professor")) {
					String ProfessorLike = "Visitor " + getVisitorNum() + " did like " + randomLocation + ".\n";
					toReturn =  toReturn.concat(  VisitorLocation + ProfessorLike);
				}
				
				// Blogger Preference
				else if (getVisitorType().equals("Blogger" )) {
					String BloggerDislike = "Visitor " + getVisitorNum() + " did not like " + randomLocation + ".\n";
					
//					System.out.println("Blogger " + BloggerDislike);
					
					toReturn =   toReturn.concat( VisitorLocation + BloggerDislike);
				}
				
				   
				/***************Fun-Preference END******************/
				
				
				
				
				randomLocation = _location.getRandomLocation();
				
//				System.out.println(randomLocation);

				
				
				

					
			}
		while (randomLocation  != "Leave" ) ;
		

		
	
		 String leaveCity = "Visitor " + getVisitorNum() + " has left the city.";

			String result = VisitorInfo + toReturn + leaveCity;
                        
			i++;
        	
		
		return result;
	}
		
	


}
