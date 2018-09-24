package org.RobotPractice.src.org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.subsystems.DriveMotorGroup;

public class Driving {
	public DriveMotorGroup[] motorGroups;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Driving() {
		motorGroups[0] = new DriveMotorGroup(Robot.hardware.driveRMotor1, Robot.hardware.driveRMotor2, Robot.hardware.driveRMotor3);
		motorGroups[1] = new DriveMotorGroup(Robot.hardware.driveRMotor4, Robot.hardware.driveRMotor5, Robot.hardware.driveRMotor6);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
