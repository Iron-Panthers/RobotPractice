package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.util.Constants;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveToTarget extends Command {
	int target;
	int tolerance;
    public DriveToTarget(int target) {
    	requires(Robot.drive);
    	this.target = target;
    	tolerance = Constants.DRIVE_TICK_TOLERANCE;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.moveTo(target);
    	System.out.println(Robot.drive.left.masterMotor.getSelectedSensorPosition(Constants.PID_IDX));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Math.abs(target - Robot.drive.left.masterMotor.getSelectedSensorPosition(Constants.PID_IDX)) < tolerance) {
    		return true;
    	}
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
