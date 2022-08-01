package simple_pg1;

public  class Zoo
{
	   public static void main (String ar[])
	    {
		   Animal a = new Lion();
		   a.eat();
		   a.sleep();
		   a= new Rabbit();
		   a.eat();
		   a.sleep();
	    }
	  }
