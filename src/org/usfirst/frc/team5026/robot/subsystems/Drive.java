package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;
import org.usfirst.frc.team5026.robot.util.Constants;
import org.usfirst.frc.team5026.robot.util.MotorGroup;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	public MotorGroup left;
	public MotorGroup right;
	public Drive() {
		left = Robot.hardware.left;
		right = Robot.hardware.right;
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	/**
	 * The move method drives with a given power
	 * @param power
	 * Between -1 and 1, relates to the voltage applied to the motor
	 */
//	public void move(double power) {
//		left.set(power);
//		right.set(power);
//	}
	
	/**
	 * This move method sets the left and right power of the motors
	 * @param leftPower
	 * Between -1 and 1, relates to the voltage applied to the motor
	 * @param rightPower
	 * Between -1 and 1, relates to the voltage applied to the motor
	 */
	public void move(double leftPower, double rightPower) {
		left.set(leftPower);
		right.set(rightPower);
	}
	
	public void moveTo(int target) {
		left.moveTo(target);
		right.moveTo(target);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
