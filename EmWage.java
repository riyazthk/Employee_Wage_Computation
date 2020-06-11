public class EmWage{
 int wages=20;
 int fullday=0;
 int parttime=0;
public void calculate(int val){
int va=val+(int)(Math.random()*2);
 switch(va){
          case 0:
               fullday=8;
               System.out.println(fullday);
               break;
          case 1:
               parttime=4;
               System.out.println(parttime);
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
