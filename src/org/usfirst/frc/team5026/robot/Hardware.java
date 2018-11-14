package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.util.Constants;
import org.usfirst.frc.team5026.robot.util.MotorGroup;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
	public TalonSRX driveRMotor1;
	public TalonSRX driveRMotor2;
	public TalonSRX driveRMotor3;
	public TalonSRX driveLMotor1;
	public TalonSRX driveLMotor2;
	public TalonSRX driveLMotor3;
	
	public MotorGroup left;
	public MotorGroup right;
	public Hardware() {
		this.driveRMotor1 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_1);
		this.driveRMotor2 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_2);
		this.driveRMotor3 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_3);
		this.driveLMotor1 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_1);
		this.driveLMotor2 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_2);
		this.driveLMotor3 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_3);
		left = new MotorGroup(driveLMotor1, driveLMotor2, driveLMotor3);
		left.setInverted(Constants.IS_LEFT_INVERTED);
		right = new MotorGroup(driveRMotor1, driveRMotor2, driveRMotor3);
		right.setInverted(Constants.IS_RIGHT_INVERTED);
	}
}
