package trainingschema;

public enum TrainingSchedule {
 
	beginner_enum(Level.beginner, 100, new WeekDay[]{WeekDay.monday, WeekDay.tuesday}),
    lower_intermediate_enum (Level.lower_intermediate, 100, new WeekDay[]{WeekDay.monday}),
    pro (Level.pro, 100, new WeekDay[]{WeekDay.monday}),
    national_team (Level.national_team, 100, new WeekDay[]{WeekDay.monday});
	
	public final Level level;
	public final int durationinmins;
	public final WeekDay[] trainingdays;
	
	TrainingSchedule (Level level, int durationinmins, WeekDay[] days){
		this.level = level;
		this.durationinmins = durationinmins;
		this.trainingdays = days;
	}
	
	public Level getLevel (){
		return level;
	}
	public int getDuration (){
		return durationinmins;
	}
	public WeekDay[] getTrainingDays(){
		return trainingdays;
	}
}