package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GetAcceleration extends Command 
{
	public static double x = 0;
	public static double y = 0;
	public static double z = 0;
	BuiltInAccelerometer accl = new BuiltInAccelerometer();
	public GetAcceleration() 
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.accelerometer);
	}

	// Called just before this Command runs the first time
	protected void initialize() 
	{
		
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() 
	{
		SmartDashboard.putDouble("x", accl.getX());
		SmartDashboard.putDouble("y", accl.getY());
		SmartDashboard.putDouble("z", accl.getZ());
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() 
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end() 
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() 
	{
	}
}
