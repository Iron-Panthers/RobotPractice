package org.usfirst.frc.team5026.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
	public TalonSRX driveRMotor1;
	public TalonSRX driveRMotor2;
	public TalonSRX driveRMotor3;
	public TalonSRX driveLMotor1;
	public TalonSRX driveLMotor2;
	public TalonSRX driveLMotor3;
	
	public Hardware() {
		this.driveRMotor1 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_1);
		this.driveRMotor2 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_2);
		this.driveRMotor3 = new TalonSRX(RobotMap.DRIVE_RIGHT_MOTOR_3);
		this.driveLMotor1 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_1);
		this.driveLMotor2 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_2);
		this.driveLMotor3 = new TalonSRX(RobotMap.DRIVE_LEFT_MOTOR_3);
	}
}
