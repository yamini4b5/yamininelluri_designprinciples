package com.BridgePattern.BridgePattern;
public class BlueCircle implements DrawAPI {
	   public void drawCircle(int radius, int a, int b) {
	      System.out.println("Drawing Circle[colour:blue,radius: " + radius + ", a: " + a + ", " + b + "]");
	   }
	}