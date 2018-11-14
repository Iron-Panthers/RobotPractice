package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.util.Constants;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveFindF extends Command {
	
	long prevTicks;
	long prevNano;

    public DriveFindF() {
    	requires(Robot.drive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	prevTicks = Robot.drive.left.masterMotor.getSelectedSensorPosition(Constants.PID_IDX);
    	prevNano = System.nanoTime();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	long dTicks = Robot.drive.left.masterMotor.getSelectedSensorPosition(Constants.PID_IDX) - prevTicks;
    	long dNanos = System.nanoTime() - prevNano;
    	prevNano = System.nanoTime();
    	double dMiliSec = ((double)dNanos) / 100000000.0;
    	prevTicks = Robot.drive.left.masterMotor.getSelectedSensorPosition(Constants.PID_IDX);
    	Robot.drive.move(0.5, 0.5);
    	double velocity = dTicks / dMiliSec; //Robot.drive.left.masterMotor.getSelectedSensorVelocity(Constants.PID_IDX);
    	System.out.println(dNanos);
    	System.out.println("F: "+ (velocity/0.5));
    	
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
