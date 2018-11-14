package org.usfirst.frc.team5026.robot.util;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class MotorGroup {
	public ArrayList<TalonSRX> motors;
	public TalonSRX masterMotor;
	
	public MotorGroup(TalonSRX motor1, TalonSRX... motors) {
		this.motors = new ArrayList<TalonSRX>();
		motor1.config_kP(Constants.PID_IDX, Constants.DRIVE_P, Constants.kTimeoutMs);
		motor1.config_kI(Constants.PID_IDX, Constants.DRIVE_I, Constants.kTimeoutMs);
		motor1.config_kD(Constants.PID_IDX, Constants.DRIVE_D, Constants.kTimeoutMs);
		motor1.config_kF(Constants.PID_IDX, Constants.DRIVE_F, Constants.kTimeoutMs);
		motor1.configMotionAcceleration(Constants.DRIVE_ACCELERATION, Constants.kTimeoutMs);
		motor1.configMotionCruiseVelocity(Constants.DRIVE_VELOCITY, Constants.kTimeoutMs);
		masterMotor = motor1;
		for (int i = 0; i < motors.length; i++) {
			this.motors.add(motors[i]);
			motors[i].follow(masterMotor);
		}
	}
	
	public void set(double power) {
		masterMotor.set(ControlMode.PercentOutput, power);
	}
	
	public void moveTo(int target) {
		masterMotor.set(ControlMode.MotionMagic, target);
	}
	
	public void stop() {
		masterMotor.set(ControlMode.PercentOutput, 0);
	}
	
	public void setInverted(boolean isInverted) {
		masterMotor.setInverted(isInverted);
		for(int i = 0; i < motors.size(); i++) {
			motors.get(i).setInverted(isInverted);
		}
		
	}
}
