public class Member {
	private Person p1;
	private Date d1;
	
	public Member(Person p, Date d){
		p1 = null;
		d1 = null;
	}
	
	/*
	public void setPerson(Person p){
		p = p1;
	}
	
	public void setDate(Date d){
		d = d1;
	}
	
	public Person p(){
		return p1;
	}
	
	
	*/
	
	public String getPerson(){
		return p1.getName()+p1.getTele();
	}
	//Join date
	public String getJoinDate(){
		return d1.getDate();
	}
	
	public void editName(String n){
		p1.setName(n);
	}
	
	public void editNumber(String tele){
		p1.setTelephone(tele);
	}
	
	public void editDate(int d,int m,int y){
		d1.setDate(d,m,y);
	}
	
	
	public String toString(){
		return p1+" "+d1;
	}
	
	public static void main(String[] args){
		Date today = new Date(30,1,1994);
		today.display();
		Person person1 = new Person("Jenny Jenny","867-5309");
		person1.display();
		Member M1 = new Member(person1, today);
		M1.toString();
	}
	
}
