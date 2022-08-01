package industrial_t;


interface Sim 
{
  void sms();
  void call();
  void internet();
}

abstract class SmsCall implements Sim
{
 public void sms()
 {
 System.out.println("150 message per day");
 }
 public void call()
 {
   System.out.println("Unlimited calls");
 }
}
class Jio extends SmsCall
{
 
 public void mms()
 {
   System.out.println("50 mms per day ");
 }
 public void internet()
 {
   System.out.println("2.0 gb per day ");
 }
}

class Airtel extends SmsCall
{
 public void internet()
 {
   System.out.println("1.5 gb per day ");
 }
 public void mms()
 {
   System.out.println("20 mms per day ");
 }
}


public class SmartPhone 
{
 public static void main (String ar[])
 {
   SmsCall s = new Jio();

   Jio s1 = new Jio();
   System.out.println("JIO");
   s.sms();
   s.call();
   s.internet();
   s1.mms();
   s=new Airtel();
   Airtel s2=new Airtel();
   System.out.println("AIRTEL");
   s.sms();
   s.call();
   s2.internet();
   s2.mms();
 }
}


