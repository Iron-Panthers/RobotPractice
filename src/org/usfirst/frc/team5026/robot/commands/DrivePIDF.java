package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.util.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivePIDF extends Command {
	double desiredVelocity = 0;
	double currentError = desiredVelocity;
	double previousError = currentError;
	double totalError = 0;
	double deltaError = 0;
	
    public DrivePIDF(double desiredVelocity) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    	this.desiredVelocity = desiredVelocity;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentError = desiredVelocity - Robot.drive.left.motors.get(0).getSelectedSensorVelocity(Constants.PID_IDX);
    	deltaError = currentError - previousError;
    	double PIDF = Constants.DRIVE_F*desiredVelocity + (currentError*Constants.DRIVE_P) + (totalError*Constants.DRIVE_I) + (deltaError*Constants.DRIVE_D);
    	Robot.drive.move(PIDF);
    	previousError = currentError;
    	totalError += currentError;
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
