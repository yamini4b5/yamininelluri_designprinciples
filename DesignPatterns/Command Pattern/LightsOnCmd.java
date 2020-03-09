package com.CommandPattern.CommandPattern;

public class LightsOnCmd implements Command{
	  Light light;
	  public LightsOnCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	  }
	}