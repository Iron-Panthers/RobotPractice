package org.usfirst.frc.team5026.robot.util;

import edu.wpi.first.wpilibj.Joystick;

public class GoodJoystick extends Joystick {
	private double magnitude;
	private double x;
	private double y;
	
	public GoodJoystick (int port) {
		super(port);
		x = 0;
		y = 0;
		magnitude = 0;
	}
	
	public void findMagnitude() {
		x = getX();
		y = getY();
		//Gets Vector of joystick using pythagorean theorem
		magnitude = Math.abs(Math.sqrt(x * x + y * y));
		if (magnitude > 1) {
			magnitude = 1;
		}
		//TODO: Normalize, and zero magnitude if less than deadzone, trigger reverse, scaling
		
		//Applies deadzone to magnitude, then scales it to maintain the ability from having 
		double scaledMagnitude = (magnitude - Constants.CIRCLE_DEADZONE) / (1 - Constants.CIRCLE_DEADZONE);
		x *= scaledMagnitude;
		y *= scaledMagnitude;
		magnitude *= scaledMagnitude;
	}
	public double findLeftPower() {
		findMagnitude();
		return (y + x);
	}
	public double findRightPower() {
		findMagnitude();
		return (y - x);
	}
}
