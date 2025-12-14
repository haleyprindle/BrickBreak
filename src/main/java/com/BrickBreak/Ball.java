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

	public int getYpos()
	{
		return yPos;
	}

	public int getXpos()
	{
		return xPos;
	}

	public void setX(int xPos)
	{
		this.xPos = xPos;
	}

	public void setY(int yPos)
	{
		this.yPos = yPos;
	}

	public void reverseX()
	{
		xVelocity *=-1;
	}

	public void reverseY()
	{
		yVelocity *=-1;
	}

	public void setXVelocity(int xVelocity)
	{
		this.xVelocity = xVelocity;
	}

	public void setYVelocity(int yVelocity)
	{
		this.yVelocity = yVelocity;
	}
	
	public int getSize()
	{
		return size;
	}

	public void move ()
	{
		xPos+=xVelocity;
		yPos+=yVelocity;
	}

	public void draw (Graphics g)
	{
		g.setColor(Color.BLUE); // call first to set the desired color
	   	g.fillOval(xPos , yPos, size, size); // draws an oval (ball)
	}

}
