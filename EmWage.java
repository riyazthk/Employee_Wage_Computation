import java.util.ArrayList;
import java.util.Scanner;

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
	               System.out.println(company+" " +"total wages for full time :" + totalwages);
	               break;
	          case parttime:
	               halfday=4;
	               calWageMonth(parttime);
	               System.out.println(company +" "+ "total wages for part time time :" + totalwages);
	               break;
	   }
	}
	public static void main(String[] arg){
		
		EmWage ew=new EmWage("dmart",30,30,80);
		ew.calculate();
		EmWage ew1=new EmWage("reliance",20,15,100);
        ew1.calculate();
		  }
    
}
