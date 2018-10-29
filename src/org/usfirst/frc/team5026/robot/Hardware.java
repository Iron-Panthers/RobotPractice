package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.util.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hardware {
	public TalonSRX masterMotor;
	public TalonSRX slaveMotor;
	public Hardware() {
		masterMotor = new TalonSRX(RobotMap.ELEVATOR_MASTER);
		slaveMotor = new TalonSRX(RobotMap.ELEVATOR_SLAVE);
		slaveMotor.follow(masterMotor);
	}
}
