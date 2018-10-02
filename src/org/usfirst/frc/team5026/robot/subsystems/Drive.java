package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drive extends Subsystem {
	double left = 0;
	double right = 0;
	public Drive() {
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	public void arcadeDrive(double speed, double turn) {
		
	}
}

