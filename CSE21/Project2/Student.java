public class Student {
	private String name; 
	private char gender; 
	private Date birthDay; 
	private Preference pref; 
	private boolean matched; 
	private int month;
	private int day;
	private int year;
	public int compatabilityScore; 
	
	public Student (){ //basic constructor
		name = "Cristian";
		gender = 'M';
		matched = false;
		birthDay = new Date (month, day, year);
	}
	public Student(String name, char gender, Date birthDay, Preference pref) { 
		this.name = name;
		this.gender = gender; 
		this.birthDay = birthDay; 
		this.pref = pref; 
		
		
	}
	
	public void setName(String name){// Mutator for the name
		this.name = name;
	}

	public void setGender(char gender){	// Mutator for the gender
		this.gender = gender;
	}
	
	public void setbirthDay(Date birthDay){// Mutator for the gender
		this.birthDay = birthDay;
	}
	
	public void setPreference(Preference pref){// Mutator for the preference
		this.pref = pref;
	}
	
	public void setMatched(boolean matched){
	this.matched = matched;
	}
	
	
	public String getName() {//Accessor for the name
		return name;
	}
	
	public char getGender(){//Accessor for the Gender	
		return gender;
	}
	
	public Date getbirthDay(){//Accessor for the Day
		return birthDay;
	}
	                                  
	public Preference getPref(){//Accessor for the Preference
		return pref;
	}
	
	public boolean getMatched(){
		return matched;
	}
	
	public int compare(Student st){
		if(gender != st.gender){
		return 0; 
		}
		
		compatabilityScore = (40-pref.compare(st.pref)) + (60-birthDay.compare(st.birthDay)); 
		
		if (compatabilityScore < 0){
			return 0; 
			}
			else if (compatabilityScore > 100){
			return 100; 
			}
		
		return compatabilityScore; 
	}
	
}
