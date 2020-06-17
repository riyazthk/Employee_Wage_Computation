import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmWage {
     int wages;
	 int numworkingdays;
	 int workshrpermonth;
	 String company;
	 public final int fulltime=0;
	 public final int parttime=1;
	 public int fullday=8;
	 public int halfday=4;
	 int totalwages=0;
	EmWage(String company,int wages,int numworkingdays,int workshrpermonth){
	  this.company=company;
	  this.wages=wages;
	  this.numworkingdays=numworkingdays;
	  this.workshrpermonth=workshrpermonth;

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

	public void calculate(){
	int va=(int)(Math.random()*2);
	 switch(va){
	          case fulltime:
	               fullday=8;
	               calWageMonth(fullday);
	               //System.out.println(company+" " +"total wages for full time :" + totalwages);
	               break;
	          case parttime:
	               halfday=4;
	               calWageMonth(parttime);
	              // System.out.println(company +" "+ "total wages for part time time :" + totalwages);
	               	               break;
	   }
	}
	public static void main(String[] arg){
	    HashMap< String,Integer> hm=new HashMap<String, Integer>();

		EmWage ew=new EmWage("dmart",30,30,80);
		ew.calculate();
		hm.put(ew.company, ew.totalwages);
		EmWage ew1=new EmWage("reliance",20,15,100);
        ew1.calculate();
		hm.put(ew1.company, ew1.totalwages);

        Set set=hm.entrySet();
        Iterator iterator =set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry mentry=(Map.Entry)iterator.next();
        	System.out.println(mentry.getKey() + " = "+ mentry.getValue());
        }
	}
}
