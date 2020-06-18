import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
interface MultipleCompany{
	public void calWageMonth(int cal);
	public void employeeWages();
	public int calculate();
}
public class EmWage implements MultipleCompany {
     int wages;
	 int numworkingdays;
	 int workshrpermonth;
	 String company;
	 String name;
	 
	 
	 public final int fulltime=0;
	 public final int parttime=1;
	 public int fullday=8;
	 public int halfday=4;
	 public int totalwages=0;
	EmWage(String company,String name,int wages,int numworkingdays,int workshrpermonth){
	  this.company=company;
	  this.wages=wages;
	  this.numworkingdays=numworkingdays;
	  this.workshrpermonth=workshrpermonth;
	  this.name=name;

	}


	public void calWageMonth(int cal){
	//To calculate a wages  and fullday or parttime for single day
	int a=wages*cal;
	   for(int i=1;i<=numworkingdays;i++){
 	   int b=cal*i;
	//follows a steps and calculate a total wages for 100 hours or 20 days
 	   totalwages=a*i;
 	     if(b>100 || i>numworkingdays){
	          break;
	      }
	   }
	}

	public int calculate(){
	int va=(int)(Math.random()*2);
	 switch(va){
	          case fulltime:
	               fullday=8;
	               calWageMonth(fullday);
	               //System.out.println(company+" " +"total wages for full time :" + totalwages);
	               return totalwages;
	          case parttime:
	               halfday=4;
	               calWageMonth(parttime);
	              // System.out.println(company +" "+ "total wages for part time time :" + totalwages);
	               return totalwages;
 	               
	   }
	 return totalwages;
	}
	public void employeeWages() {
    	   	
	}
	
	public static void main(String[] arg){
	    HashMap< String,EmWage> hm=new HashMap<String,EmWage>();
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<2;i++) {
	    	System.out.println("enter your company name");
	    	String company=sc.next();
	    	System.out.println("enter company wages");
	    	int wages=sc.nextInt();
	    	System.out.println("enter a working days");
	        int numworkingdays=sc.nextInt();
	        System.out.println("enter a hours per month");
	        int workshrpermonth=sc.nextInt();
	    	for (int j=0;j<2;j++) {
	    	System.out.println("enter your name");
	        String name=sc.next();
	        MultipleCompany multipleCompany=new EmWage(company,name,wages,numworkingdays,workshrpermonth);
            EmWage emwage=new EmWage(company,name,wages,numworkingdays,workshrpermonth);
	        multipleCompany.employeeWages();	
    		emwage.totalwages=multipleCompany.calculate();

        hm.put(name,emwage);
       
    	}        

    }
    Iterator<Entry<String, EmWage>> it=hm.entrySet().iterator();
    while(it.hasNext()) {
    	Map.Entry<String, EmWage>li=(Map.Entry<String, EmWage>)it.next();
    	System.out.println(li.getKey() + " = "+li.getValue().company +" "+ li.getValue().totalwages );
    }
  }
}
    

