package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;
import org.usfirst.frc.team5026.robot.util.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	double left = 0;
	double right = 0;

	public Drive() {
		configPID(Robot.hardware.driveLMotor1);
		configPID(Robot.hardware.driveRMotor1);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void arcadeDrive(double speed, double turn) {

	}

	public void configPID(TalonSRX motor) {
		motor.config_kP(0, Constants.DRIVE_P, Constants.kTimeoutMs);
		motor.config_kI(0, Constants.DRIVE_I, Constants.kTimeoutMs);
		motor.config_kD(0, Constants.DRIVE_D, Constants.kTimeoutMs);
		motor.config_kF(0, Constants.DRIVE_F, Constants.kTimeoutMs);
	}
}
