package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called joust before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double y = Robot.m_oi.stick1.getX();
    	double x = Robot.m_oi.stick1.getY();
    	if (Math.abs(x) < 0.1) {
    		x = 0;
    	}
    	if (Math.abs(y) < 0.1) {
    		y = 0;
    	}
    	Robot.hardware.driveLMotor1.set(ControlMode.PercentOutput, (y+x));
    	Robot.hardware.driveRMotor1.set(ControlMode.PercentOutput, (y-x));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
