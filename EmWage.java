import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
interface MultipleCompany{
	public int calWageMonth(EmWage emwage);
	public int calculate();
	public int dailyWage(EmWage emwage );
}
public class EmWage implements MultipleCompany {
     int wages;
	 int numworkingdays;
	 int workshrpermonth;
	 String company;
	 String name;
     int dailywages;
	 public final int fulltime=0;
	 public final int parttime=1;
	 public int hour=0;
	 public int totalwages=0;


	public int dailyWage(EmWage emwage) {
	   dailywages=emwage.wages*emwage.hour;
	   return dailywages;
    }
	public int calWageMonth(EmWage emwage){
	   for(int i=1;i<=emwage.numworkingdays;i++){
 	      int b=emwage.hour*i;
	         //follows a steps and calculate a total wages for 100 hours or 20 days
 	         totalwages=emwage.dailywages*i;
 	         if(b>100 || i>emwage.numworkingdays){
	            break;
	         }
	   }return totalwages;
	}

	public int calculate(){
	int va=(int)(Math.random()*2);
	 switch(va){
	          case fulltime:
	               hour=8;
	               return hour;
	          case parttime:
	               hour=4;
	               return hour;

	   }
	 return hour;
	}

	public static void main(String[] arg){
	    HashMap< String,EmWage> hm=new HashMap<String,EmWage>();
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<2;i++) {
	    	EmWage emwage=new EmWage();
	    	System.out.println("enter your company name");
	    	emwage.company=sc.next();
	    	System.out.println("enter company wages");
	    	emwage.wages=sc.nextInt();
	    	System.out.println("enter a working days");
	    	emwage.numworkingdays=sc.nextInt();
	        System.out.println("enter a hours per month");
	        emwage.workshrpermonth=sc.nextInt();
	    	System.out.println("enter your name");
	    	emwage.name=sc.next();


	        MultipleCompany multipleCompany=new EmWage();
	        emwage.hour=multipleCompany.calculate();
            emwage.dailywages=multipleCompany.dailyWage(emwage);
            emwage.totalwages=multipleCompany.calWageMonth(emwage);
            hm.put(emwage.name,emwage);

    	}
	    Iterator<Entry<String, EmWage>> it=hm.entrySet().iterator();
	    while(it.hasNext()) {
	    	Map.Entry<String, EmWage>li=(Map.Entry<String, EmWage>)it.next();
	    	System.out.println(li.getKey() + " = "+li.getValue().company +" "+ li.getValue().totalwages +" "+li.getValue().dailywages);
    }
   }
  }








