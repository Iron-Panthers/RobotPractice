package org.usfirst.frc.team5026.robot.util;

public class Constants {
	//MotionMagic
	public static final double DRIVE_P = 0;
	public static final double DRIVE_I = 0;
	public static final double DRIVE_D = 0;
	public static final double DRIVE_F = 0; //taken from FRC 2018 code
	public static final int DRIVE_VELOCITY = 5000; //Random
	public static final int DRIVE_ACCELERATION = 9001; //Random
	public static final int kTimeoutMs = 0; // Do not change
	public static final int PID_IDX = 0; //0 For closed-loop control
	
	//Own PID for driving at a velocity
	public static final double DRIVE_VELOCITY_P = 0;
	public static final double DRIVE_VELOCITY_I = 0;
	public static final double DRIVE_VELOCITY_D = 0;
	public static final double DRIVE_VELOCITY_F = 0.1; //random

}
