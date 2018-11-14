package org.usfirst.frc.team5026.robot.util;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class MotorGroup {
	public ArrayList<TalonSRX> motors;
	
	public MotorGroup(TalonSRX motor1, TalonSRX... motors) {
		motor1.config_kP(Constants.PID_IDX, Constants.DRIVE_P, Constants.kTimeoutMs);
		motor1.config_kI(Constants.PID_IDX, Constants.DRIVE_I, Constants.kTimeoutMs);
		motor1.config_kD(Constants.PID_IDX, Constants.DRIVE_D, Constants.kTimeoutMs);
		motor1.config_kF(Constants.PID_IDX, Constants.DRIVE_F, Constants.kTimeoutMs);
		motor1.configMotionAcceleration(Constants.DRIVE_ACCELERATION, Constants.kTimeoutMs);
		motor1.configMotionCruiseVelocity(Constants.DRIVE_VELOCITY, Constants.kTimeoutMs);
		this.motors.add(motor1);
		for (int i = 0; i < motors.length; i++) {
			this.motors.add(motors[i]);
			motors[i].follow(this.motors.get(0));
		}
	}
	
	public void set(double power) {
		motors.get(0).set(ControlMode.PercentOutput, power);
	}
	
	public void moveTo(int target) {
		motors.get(0).set(ControlMode.MotionMagic, target);
	}
	
	public void stop() {
		motors.get(0).set(ControlMode.PercentOutput, 0);
	}
}
