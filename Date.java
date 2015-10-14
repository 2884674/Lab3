public class Date{

private int day, month, year;
 
public Date(int d, int m, int y){
	day = d;
	month = m;
	year = y;
}

	public void setDay(int d){
		day = d;
	}
 
	public void setMonth(int m){
		month = m;
	}
 
	public void setYear(int y){
		year = y;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getDate(){
		return day+"/"+month+"/"+year;
	}
	
	public void display(){
		String out =  "Day: "+day+"\nMonth:"+month+"\nYear: "+year+"\n";
	        System.out.println(out);
	}

	 
	public static void main(String[] args){
		Date d1 = new Date(30, 5, 1994);
		d1.display();
	}
//SETDATETHING

	public void setDate(int d, int m, int y) {
		// TODO Auto-generated method stub
		
	}

}
