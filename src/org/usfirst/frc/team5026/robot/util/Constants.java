package org.usfirst.frc.team5026.robot.util;

public class Constants {
	//MotionMagic
	public static final double DRIVE_P = 0;
	public static final double DRIVE_I = 0;
	public static final double DRIVE_D = 0;
	public static final double DRIVE_F = 3200; //taken from FRC 2018 code (ticks per 100ms)
	public static final int DRIVE_VELOCITY = 5000; //Random
	public static final int DRIVE_ACCELERATION = 9001; //Random
	public static final int kTimeoutMs = 0; // Do not change
	public static final int PID_IDX = 0; //0 For closed-loop control
	public static final int DRIVE_TICK_TOLERANCE = 100; //Drive should be within 100 ticks of target
	public static final int BASELINE_TARGET = 10000; //To be tested
	
	//Own PID for driving at a velocity
	public static final double DRIVE_VELOCITY_P = 0;
	public static final double DRIVE_VELOCITY_I = 0;
	public static final double DRIVE_VELOCITY_D = 0;
	public static final double DRIVE_VELOCITY_F = 33000; //Tested, used this to do desiredVelocity/f = motor power, ticks per second
	
	public static final boolean IS_LEFT_INVERTED = true;
	public static final boolean IS_RIGHT_INVERTED = false;

}
