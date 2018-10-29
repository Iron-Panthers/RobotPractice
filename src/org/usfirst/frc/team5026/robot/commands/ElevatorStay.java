package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.util.Constants;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorStay extends Command {
	public int position;
    public ElevatorStay() {
    	requires(Robot.elevator);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.targetPosition = Robot.elevator.masterMotor.getSelectedSensorPosition(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.elevator.moveTo(Robot.elevator.targetPosition);
    	Robot.elevator.targetPosition += Robot.m_oi.stick.getY()*Constants.ELEVATOR_SPEED;
    	if (Robot.elevator.targetPosition > Constants.ELEVATOR_TOP) {
    		Robot.elevator.targetPosition = Constants.ELEVATOR_TOP;
    	}
    	else if (Robot.elevator.targetPosition < 0) {
    		Robot.elevator.targetPosition = 0;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.move(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.elevator.move(0);
    }
}
