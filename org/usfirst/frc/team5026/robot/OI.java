/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5026.robot;
import org.usfirst.frc.team5026.robot.commands.ElevatorMoveTo;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import src.org.usfirst.frc.team5026.robot.util.Constants;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick stick;
	public JoystickButton stickButton1;
	public OI() {
		this.stick = new Joystick(Constants.STICK_1);
		this.stickButton1 = new JoystickButton(stick, Constants.BUTTON_1);
		this.stickButton1.whenPressed(new ElevatorMoveTo(0));
//		this.button1.whileHeld (new DriveForward());
//		this.button2.whileHeld (new DriveBackward());
	}
}