package signup;

import trainingschema.Level;
import trainingschema.WeekDay;

public class User {
  
	private Level level;
	private WeekDay[] attendingOn;
	private TrainingDays[] usertrainingDays;
	
	public User(Level level) {
		this.level = level;
	}	
	
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public WeekDay[] getAttendingOn() {
		return attendingOn;
	}
	public void setAttendingOn(WeekDay[] attendingOn) {
		this.attendingOn = attendingOn;
	}
}
