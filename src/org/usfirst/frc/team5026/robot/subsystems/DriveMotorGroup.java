package org.RobotPractice.src.org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.commands.MoveUp;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Allows the User to control each motor group individually.
 */
public class DriveMotorGroup extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private Talon[] motors;

	public DriveMotorGroup(Talon m0, Talon m1, Talon m2) {
		motors = new Talon[2];
		motors[0] = m0;
		motors[1] = m1;
		motors[2] = m2;
	}

	/**
	 * Sets the power level of the <code>motor</code> to <code>power_level</code>.
	 * 
	 * @param power_level The power level of the motor group. Range: -1 to 1
	 *                    (inclusive).
	 */
	public void set(double power_level) {
		for (int i = 0; i < motors.length; i++) {
			motors[i].set(power_level);
		}
	}

	/**
	 * Sets the motor group speeds to 0
	 * 
	 * @param motor_id The id that represents the motor you wish to stop. Range: 0
	 *                 to 3 (inclusive);
	 */
	public void stop() {
		for (int i = 0; i < motors.length; i++) {
			this.motors[i].set(0);
		}
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
	}
}
