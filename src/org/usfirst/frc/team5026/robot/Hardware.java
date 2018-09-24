package org.RobotPractice.src.org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public Talon driveRMotor1;
	public Talon driveRMotor2;
	public Talon driveRMotor3;
	public Talon driveLMotor1;
	public Talon driveLMotor2;
	public Talon driveLMotor3;
	public SpeedControllerGroup left;
	public SpeedControllerGroup right;
	public Hardware() {
		this.driveRMotor1 = new Talon(0);
		this.driveRMotor2 = new Talon(1);
		this.driveRMotor3 = new Talon(2);
		this.driveLMotor1 = new Talon(3);
		this.driveLMotor2 = new Talon(4);
		this.driveLMotor3 = new Talon(5);
		left = new SpeedControllerGroup(driveLMotor1, driveLMotor2, driveLMotor3);
		right = new SpeedControllerGroup(driveRMotor1, driveRMotor2, driveRMotor3);
	}
}
