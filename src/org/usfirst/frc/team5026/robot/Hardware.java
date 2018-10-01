package org.usfirst.frc.team5026.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public TalonSRX driveRMotor1;
	public TalonSRX driveRMotor2;
	public TalonSRX driveRMotor3;
	public TalonSRX driveLMotor1;
	public TalonSRX driveLMotor2;
	public TalonSRX driveLMotor3;

	
	public Hardware() {
		this.driveRMotor1 = new TalonSRX(0);
		this.driveRMotor2 = new TalonSRX(1);
		this.driveRMotor3 = new TalonSRX(2);
		this.driveLMotor1 = new TalonSRX(3);
		this.driveLMotor2 = new TalonSRX(4);
		this.driveLMotor3 = new TalonSRX(5);
		driveLMotor2.follow(driveLMotor1);
		driveLMotor3.follow(driveLMotor1);
		driveRMotor2.follow(driveRMotor1);
		driveRMotor3.follow(driveRMotor1);
				
	}
}
