package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drive extends Subsystem {
	double left = 0;
	double right = 0;
	DifferentialDrive robotDrive;
	public Drive(SpeedControllerGroup left, SpeedControllerGroup right) {
		robotDrive = new DifferentialDrive(left, right);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	public void arcadeDrive(double speed, double turn) {
		
	}
}

