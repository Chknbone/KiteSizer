/* Kite.java
 * Written by: CB
 * 
 * Combines Username, windSpeed, weight and KiteSize.
 */

package kitesizer;

import java.time.LocalDate;

class Kite {

	//fields
	private LocalDate todaysDate;
	private String user;
	private int speed;
	private int weight;
	private int kiteSize;


	//constructor
	Kite() {
		todaysDate = LocalDate.now();
	}

	LocalDate getTodaysDate() {
		return todaysDate;
	}

	void setTodaysDate(LocalDate todaysDateSetter) {
		this.todaysDate = todaysDateSetter;
	}

	void setUser(String s) { this.user = s; }

	void setWeight(int n) { this.weight = n; }

	void setSpeed(int n) { this.speed = n; }

	void setKiteSize(int n) { this.kiteSize = n; }

	public String toString() {
		return "Hello " + this.user + " With your weight of " + this.weight + " lbs, and the wind at "
				+ this.speed + " knots, \nrecommended kite size is " + this.kiteSize
				+ ". \nData only valid for today's date: " + this.todaysDate;
	}


}
