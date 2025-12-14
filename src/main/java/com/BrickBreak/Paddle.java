//
//  Class author:  Haley Prindle 
//  Date created:  12/12/25
//  General description: a brief summary of what this particular class does.
//


package com.BrickBreak;

import java.awt.Graphics;
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

	public int getY()
	{
		return y;
	}

	public int getX()
	{
		return x;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public int getVelocity()
	{
		return xVelocity;
	}

	public void addVelocity(int addVelocity)
	{
		this.xVelocity+= addVelocity;
	}	
	
	public void setX (int x)
	{
		this.x = x;
	}

	public void setVelocity (int xVelocity)
	{
		this.xVelocity = xVelocity;
	}

	public void move ()
	{
		x+=xVelocity;
	}

	public void draw (Graphics g)
	{
		g.setColor(Color.BLUE); // call first to set the desired color
        g.fillRect(x , y, width, height); // draws a rectangle (paddle)
	}

	
}
