package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.ElevatorStay;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	public int targetPosition;
	public TalonSRX masterMotor;
	public TalonSRX slaveMotor;
	public Elevator() {
		this.masterMotor = Robot.hardware.masterMotor;
		this.masterMotor = Robot.hardware.slaveMotor;
    }
	public int currentPosition() {
		return masterMotor.getSelectedSensorPosition(0);
	}
    public void move (double power) {
    	masterMotor.set(ControlMode.PercentOutput,  power);
    }
    public void moveTo(int target) {
    	masterMotor.set(ControlMode.MotionMagic, target);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ElevatorStay());
    }
}

