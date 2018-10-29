package org.usfirst.frc.team5026.robot.commands;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import src.org.usfirst.frc.team5026.robot.util.Constants;

public class ElevatorStay extends Command {
	private int position;
	
	public ElevatorStay() {
		requires(Robot.elevator);
	}
	public void initialize() {
		Robot.elevator.targetPosition = Robot.elevator.currentPosition();
		Robot.elevator.targetPosition += Robot.m_oi.stick.getY()*Constants.ELEVATOR_SPEED;
	}
	protected void execute() {
		Robot.elevator.moveTo(position);
	}
	protected void end() {
		Robot.elevator.move(0);
	}
	protected void interrupted() {
		Robot.elevator.move(0);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}