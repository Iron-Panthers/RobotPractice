package org.usfirst.frc.team5026.robot.commands;
import org.usfirst.frc.team5026.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ElevatorMoveTo extends Command {
	double tolerance = 100;
	int target = 0;
	public ElevatorMoveTo(int target) {
	}
	public void execute() {
		Robot.elevator.targetPosition = this.target;
	}
	public boolean isFinished() {
		return true;
	}
}