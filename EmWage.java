public class EmWage{
 int wages=20;
 int fullday=0;
 int parttime=0;
 int totalwages=0;

public void calWageMonth(int cal){
int a=wages*cal;
   for(int i=1;i<=30;i++){
   int b=cal*i;
   totalwages=a*i;
     if(b>100 || i>20){
          break;
      }
   }
}

public void calculate(int val){
int va=val+(int)(Math.random()*2);
 switch(va){
          case 0:
               fullday=8;
               calWageMonth(fullday);
               System.out.println("total wages for full time :" + totalwages);
               break;
          case 1:
               parttime=4;
               calWageMonth(parttime);
               System.out.println("total wages for part time time :" + totalwages);
               break;
   }
}
public static void main(String[] arg){
EmWage ew=new EmWage();
 int val=(int)(Math.random()*2);

     if(val==0){
          ew.calculate(val);
    }else{
          System.out.println("employee is absent");
    }
  }
}
