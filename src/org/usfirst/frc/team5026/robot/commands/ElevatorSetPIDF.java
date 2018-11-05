package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.util.Constants;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ElevatorSetPIDF extends Command {

    public ElevatorSetPIDF() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Setup PIDF!");
    	double f = SmartDashboard.getNumber("Elevator F", 0);
    	double p = SmartDashboard.getNumber("Elevator P Term", 0);
    	double i = SmartDashboard.getNumber("Elevator I", 0);
    	double d = SmartDashboard.getNumber("Elevator D", 0);
    	int v = (int)SmartDashboard.getNumber("Elevator V Term", 0);
    	int a = (int)SmartDashboard.getNumber("Elevator A Term", 0);
    	Robot.elevator.masterMotor.config_kF(Constants.PID_IDX, f, Constants.TIMEOUT_MS);
    	Robot.elevator.masterMotor.config_kP(Constants.PID_IDX, p, Constants.TIMEOUT_MS);
    	Robot.elevator.masterMotor.config_kI(Constants.PID_IDX, i, Constants.TIMEOUT_MS);
    	Robot.elevator.masterMotor.config_kD(Constants.PID_IDX, d, Constants.TIMEOUT_MS);
    	Robot.elevator.masterMotor.configMotionCruiseVelocity(v, Constants.TIMEOUT_MS);
    	Robot.elevator.masterMotor.configMotionAcceleration(a, Constants.TIMEOUT_MS);
    	System.out.println("PIDFAV: "+p+" "+i+" "+d+" "+f+" "+a+" "+v);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
