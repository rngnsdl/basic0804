package class0804;

public class Undergraduate extends Student{
	String clubName; //대학생 동아리명
	
	Undergraduate(){
		super();
		clubName = "";
	}
	
	Undergraduate(String name, int number, String clubName){
		super(name,number);
		setClubName(clubName);
	}

	public String getClubName() {
		return clubName;
	}
	public boolean equals(Undergraduate other) {
		return (super.equals(other))&&(this.clubName.equals(other.clubName));
	}
	
	@Override
	public String toString() {
	return super.toString()+",동아리 이름: "+getClubName();
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	
	
}
