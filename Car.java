package oopsassignment1;

public class Car 
{
	int Model;
	String Make;
	int Speed;
public Car(int model, String Make)
{
	super();
	this.Model = model;
	this.Make = Make;
}
public int getModel()
{
	return Model;
}
public int getSpeed()
{
	return Speed;
}
public void setModel()
{
	this.Model=Model;
}
public void setSpeed(int Speed)
{
	this.Speed=Speed;
}
public String getMake()
{
	return Make;
}
public void setMake(String Make)
{
	this.Make=Make;
}
public void accelerate()
{
	Speed+=5;
}
public void brake()
{
	Speed-=5;
	if(Speed<0)
	{
		Speed=0;
	}
}
}