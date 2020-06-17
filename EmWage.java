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
	public static void main(String[] arg){
	    HashMap< String,HashMap<String,Integer>> hm=new HashMap<String,HashMap<String,Integer>>();
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
        int totalwages=new EmWage(company,name,wages,numworkingdays,workshrpermonth).calculate();
    	hm.put(name,new HashMap() {{put(company,totalwages);}});
       
    	}        

    }
    System.out.println(hm);
       Set set=hm.entrySet();
        Iterator iterator =set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry mentry=(Map.Entry)iterator.next();
        	System.out.println(mentry.getKey() + "  "+ mentry.setValue(mentry.getKey()+" "+mentry.getValue())); 
        }
	}
}
    

