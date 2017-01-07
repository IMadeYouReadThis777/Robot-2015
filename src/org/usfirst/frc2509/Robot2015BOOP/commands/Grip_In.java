package org.usfirst.frc2509.Robot2015BOOP.commands;

import org.usfirst.frc2509.Robot2015BOOP.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Grip_In extends Command {
    public Grip_In() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.grips);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.grips.In();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
