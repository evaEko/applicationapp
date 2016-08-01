package signup;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import trainingschema.Level;
import trainingschema.TrainingSchedule;
import trimesterschema.Trimester;
import trainingschema.WeekDay;

public class Run {

	public static void main(String[] args) {
		//trimester data:
		Trimester t = new Trimester(2016, 3);
		
		//user:
        User u = new User(Level.beginner);
          
        WeekDay[] levelTrainingDays;
        switch (u.getLevel()) {
		case beginner:
			levelTrainingDays = TrainingSchedule.beginner_enum.trainingdays;
			break;
		case lower_intermediate:
			levelTrainingDays = TrainingSchedule.lower_intermediate_enum.trainingdays;
			break;
		case pro:
			levelTrainingDays = TrainingSchedule.pro.trainingdays;
			break;
		case national_team:
			levelTrainingDays = TrainingSchedule.national_team.trainingdays;
			break;
		}
        
        //set the days user chose:
        WeekDay[] userTrainingDays = {WeekDay.friday, WeekDay.monday};
		u.setAttendingOn(userTrainingDays);
        
		//get the actual trainings on the userTrainingDays in the given Trimester:
		for (int i = 0; i < userTrainingDays.length; i++) {
			
		}
		

	}
}