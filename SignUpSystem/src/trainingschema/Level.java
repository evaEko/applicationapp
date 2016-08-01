package trainingschema;

public enum Level {
	
	beginner("beginner"),
    lower_intermediate ("lower-intermediate"),
    pro ("pro"),
    national_team ("repre");
	
	private String lev;

	Level (String level){
		lev = level;
	}
	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}
}
