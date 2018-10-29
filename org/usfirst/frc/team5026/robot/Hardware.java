package org.usfirst.frc.team5026.robot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import src.org.usfirst.frc.team5026.robot.util.Constants;

public class Hardware {
	public Talon driveRMotor1;
	public Talon driveRMotor2;
	public Talon driveRMotor3;
	public Talon driveLMotor1;
	public Talon driveLMotor2;
	public Talon driveLMotor3;
	public TalonSRX slaveMotor;
	public TalonSRX masterMotor;
	public Hardware() {
		this.driveRMotor1 = new Talon(0);
		this.driveRMotor2 = new Talon(1);
		this.driveRMotor3 = new Talon(2);
		this.driveLMotor1 = new Talon(3);
		this.driveLMotor2 = new Talon(4);
		this.driveLMotor3 = new Talon(5);
		this.slaveMotor = new TalonSRX(Constants.MOTOR_1);
		this.masterMotor = new TalonSRX(Constants.MOTOR_2);
				
	}
}