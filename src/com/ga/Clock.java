package com.ga;

class Clock {
	// instance variables
	private int hr;
	private int min;
	private int sec;

	// constructors: same name as class name. No type.
	public Clock() { // default constructor <---------- Calls a setter method
		this.hr=0;
		this.min=0;
		this.sec=0;		
	}

	public Clock(int hours, int minutes, int seconds) { // <---------- Calls a setter method
		this.hr=hours;
		this.min=minutes;
		this.sec=seconds;
	}

//instance methods
	public void setTime(int hours, int minutes, int seconds) {
		if(hr<24) {
			this.hr=0;
		} else {this.hr=hours;} 
		if (min<60) {
			this.min=0;
		} else {this.min=minutes;}
		if (sec<60) {
			this.sec=0;
		} else {this.sec=seconds;}
		
		// check if hours exceeds 24
		// check if minutes exceeds 60
		// check if seconds exceeds 60

	} // end of setTime

	// mutator methods
	public void incrementSeconds() {

		setTime(this.hr,this.min,this.sec+1);
		if(this.sec==0) {incrementMinutes();}
	} // end incrementSeconds

	public void incrementMinutes() {
		setTime(this.hr,this.min+1,this.sec);
		if(this.min==0) {incrementHours();}
	} // end incrementMinutes

	public void incrementHours() {
		setTime(this.hr+1,this.min,this.sec);
	} // end incrementHours

	// accessor methods
	public int getHours() {
		return hr;
	} // end of getHours

	public int getMinutes() {
		return min;
	} // end of getMinutes

	public int getSeconds() {
		return sec;
	} // end of getSeconds

	public void printTime() { // prints time in the form hh:mm:ss
		System.out.printf("%02d:%02d:%02d", getHours(),getMinutes(),getSeconds());
	} // end printTime

	public boolean equals(Clock otherClock) { // compare two times
		boolean result = true;
		if(otherClock!=this){result= false;}
		return result;
	} // end equals

	public void makeCopy(Clock otherClock) { // object1 = object2
		otherClock=this; 
	}

	public Clock getCopy() { // get a copy of a given object
		Clock temp = new Clock();
		temp=this;
		return temp;
	}

} // end of Clock
