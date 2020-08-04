package class0804;

public class Undergraduate extends Student{
	String clubName; //���л� ���Ƹ���
	
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
	return super.toString()+",���Ƹ� �̸�: "+getClubName();
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	
	
}
