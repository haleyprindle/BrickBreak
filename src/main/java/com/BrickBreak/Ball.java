//
//  Class author:  Haley Prindle
//  Date created:  12/12/25
//  General description: a brief summary of what this particular class does.
//


package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int yPos;
	private int xPos;
	private int size;
	private int xVelocity;
	private int yVelocity;

	
	
	//constructor(s):
	public Ball (int xPos, int yPos, int size)
	{
		this.size = size;
		this.xPos = xPos;
		this.yPos = yPos;
		this.xVelocity=0;
		this.yVelocity=0;
		
	}
	//methods:



	//precondition: None
	//postcondition: returns the ball's y value
	public int getYpos()
	{
		return yPos;
	}



	//precondition: None
 	//postcondition: returns the ball's x value
	public int getXpos()
	{
		return xPos;
	}

	//precondition: x is a non-null number
	//postcondition: sets the x value of the ball equal to the inputed x
	public void setX(int xPos)
	{
		this.xPos = xPos;
	}



	//precondition: y is a non-null number
  	//postcondition: sets the y value of the ball equal to the inputed y
	public void setY(int yPos)
	{
		this.yPos = yPos;
	}


	//precondition: none
  	//postcondition: changes the x direction of the ball
	public void reverseX()
	{
		xVelocity *=-1;
	}


	//precondition: None
 	//postcondition: changes the y direction of the ball
	public void reverseY()
	{
		yVelocity *=-1;
	}



	//precondition: xVelocity is a non-null number
	//postcondition: sets the xVelocity of the ball equal to the inputed xVelocity
	public void setXVelocity(int xVelocity)
	{
		this.xVelocity = xVelocity;
	}


	//precondition: yVelocity is a non-null number
	//postcondition: sets the yVelocity of the ball equal to the inputed yVelocity
	public void setYVelocity(int yVelocity)
	{
		this.yVelocity = yVelocity;
	}
	
	//precondition: none
	//postcondition: returns the ball's size
	public int getSize()
	{
		return size;
	}

	//precondition: None
 	//postcondition: moves the ball by xVelocity and yVelocity
	public void move ()
	{
		xPos+=xVelocity;
		yPos+=yVelocity;
	}


	//precondition: g is a non-null value
	//postcondition: makes the ball on the screen
	public void draw (Graphics g)
	{
		g.setColor(Color.BLUE); // call first to set the desired color
	   	g.fillOval(xPos , yPos, size, size); // draws an oval (ball)
	}

}
