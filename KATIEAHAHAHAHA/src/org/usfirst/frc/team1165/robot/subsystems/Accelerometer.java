package org.usfirst.frc.team1165.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Accelerometer extends Subsystem
{
	AnalogAccelerometer accelerometer = new AnalogAccelerometer(0);
	protected void initDefaultCommand() 
	{
		//setDefaultCommand(new ReportAccelerometer());
	}
	
	public double acceleration()
	{
		return accelerometer.getAcceleration();
		
	}
}
