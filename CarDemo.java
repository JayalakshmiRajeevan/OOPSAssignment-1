package oopsassignment1;

class CarDemo 
{
	public static void main(String[] args) 
	{
		Car c=new Car(1965, "Bat Mobile");
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
	}

}
