
public class Person {

private String name, telephone;

	public Person(){
		name = "";
		telephone = "";
	}
	public Person(String n, String tele){
		name = n;
		telephone = tele;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setTelephone(String tele){
		telephone = tele;
	}
	
	public String getName(){
		return name;
	}
	
	public String getTele(){
		return telephone;
	}
	
	public void display(){
		String out =  "Name: "+name+"\nTelephone number: "+telephone+"\n";
        System.out.println(out);
	}
	
	
	public static void main(String[] args){
		Person p1 = new Person("Jenny","867-5309");
		p1.display();
	}
	
}
