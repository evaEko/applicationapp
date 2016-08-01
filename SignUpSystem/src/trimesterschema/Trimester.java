package trimesterschema;

import signup.User;
import trainingschema.Level;
import trainingschema.WeekDay;

import java.time.LocalDate;

import signup.TrainingDays;

public final class Trimester {
    
	private final int year;
	/**
	 * 1..4
	 */
	private final int quarter;
	
	public Trimester(int year, int quarter){
		this.year = year;
		this.quarter = quarter;
		if (quarter < 1 || quarter > 4) {
			throw new IllegalArgumentException("Parameter quarter: invalid value " + quarter + ": must be 1..4");
		}
	}
	
	public LocalDate getFirstDay() {
		return LocalDate.of(year, quarter * 3 - 2, 1);
	}
	
	public LocalDate getLastDay() {
		return getFirstDay().plusMonths(3).minusDays(1);
	}
	
	public TrainingDays getTrainingDays (User u) {
		WeekDay[] userAttendingOn = u.getAttendingOn();
		
		for (LocalDate date = getFirstDay(); date.compareTo(getLastDay()) <= 0; date = date.plusDays(1)) {
			
			System.out.println(date.toString());
		}
		
		return null;		
	}
	
//	public static void main(String[] args) {
//		User u = new User(Level.beginner);
//		u.setAttendingOn(new WeekDay[0]);
//		new Trimester(2016, 1).getTrainingDays(u);
//	}
}