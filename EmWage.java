public class EmWage{
 int wages=20;
 int fullday=0;
  
public void calculate(int val){
 switch(val){
          case 0:
               fullday=8;
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
