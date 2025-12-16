//
//  Class author:  Haley Prindle 
//  Date created:  12/12/25
//  General description: creates the movement, speed, properties, 
// 	and presence of a paddle in the Brickbreak game.
//


package com.BrickBreak;

import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int y;
	private int x;
	private int width;
	private int height;
	private int xVelocity;

	
	//constructor(s):
	public Paddle (int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.xVelocity = 0;
	}
	//methods:


	//precondition: none
	//postcondition: returns the paddles' y
	public int getY()
	{
		return y;
	}



	//precondition: none
	//postcondition: returns the paddles' x
	public int getX()
	{
		return x;
	}
	//precondition: none
	//postcondition: returns the paddles' width
	public int getWidth()
	{
		return width;
	}
	//precondition: none
	//postcondition: returns the paddles' height
	public int getHeight()
	{
		return height;
	}
	//precondition: none
	//postcondition: returns the paddles' xVelocity
	public int getVelocity()
	{
		return xVelocity;
	}


	//precondition: addVelocity is a non-null number
 	//postcondition: adds to the xVelocity of the paddle by addVelocityy to make the speed greater
	public void addVelocity(int addVelocity)
	{
		if(!(addVelocity>0 && this.xVelocity>10) || !(addVelocity<0 && this.xVelocity<-10)
		){
			this.xVelocity+= addVelocity;
		}
	}	
	//precondition: x is a non-null number
	//postcondition: sets the x value of the paddle equal to the inputed x
	public void setX (int x)
	{
		this.x = x;
	}
	//precondition: xVelocity is a non-null number
	//postcondition: sets the xVelocity value of the ball equal to the inputed xVelocity
	public void setVelocity (int xVelocity)
	{
		this.xVelocity = xVelocity;
	}
	//precondition: None
 	//postcondition: moves the paddle by xVelocity
	public void move() {
	    x+=xVelocity;	 
	 }


	//precondition: g is a non-null value
	//postcondition: draws the paddle on the screen
	public void draw (Graphics g)
	{
		g.setColor(Color.BLUE); // call first to set the desired color
        g.fillRect(x , y, width, height); // draws a rectangle (paddle)
	}

	
}