package trainingschema;

public enum WeekDay {
	
	monday("Monday"),
    tuesday ("Tuesday"),
    wednesday ("Wednesday"),
    thursday ("Thursday"),
    friday ("Friday");
    
	private final String weekday;
	
	WeekDay (String day){
		weekday = day;
	}
	
	public String getDay (){
		return weekday;
	}
}
