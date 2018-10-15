package org.usfirst.frc.team5026.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
	public TalonSRX driveRMotor1;
//	public TalonSRX driveRMotor2;
//	public TalonSRX driveRMotor3;
	public TalonSRX driveLMotor1;
//	public Talon driveLMotor2;
//	public Talon driveLMotor3;
	public Hardware() {
		this.driveRMotor1 = new TalonSRX(10);
//		this.driveRMotor2 = new Talon(1);
//		this.driveRMotor3 = new Talon(2);
		this.driveLMotor1 = new TalonSRX(3);
//		this.driveLMotor2 = new Talon(4);
//		this.driveLMotor3 = new Talon(5);
//				
	}
}
