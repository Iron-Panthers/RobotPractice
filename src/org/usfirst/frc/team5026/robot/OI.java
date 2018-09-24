/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.RobotPractice.src.org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick stick1;
	public JoystickButton button1;
	public JoystickButton button2;
	public OI() {
		this.stick1 = new Joystick(0);
		this.button1 = new JoystickButton(stick1, 1);
		this.button2 = new JoystickButton(stick1, 2);
		this.button1.whileHeld (new DriveForward());
		this.button2.whileHeld (new DriveBackward());
	}
}
