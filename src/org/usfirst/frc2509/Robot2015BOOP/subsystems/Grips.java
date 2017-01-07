package org.usfirst.frc2509.Robot2015BOOP.subsystems;

import org.usfirst.frc2509.Robot2015BOOP.RobotMap;
import org.usfirst.frc2509.Robot2015BOOP.commands.Grip_Out;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Grips extends Subsystem {
    private final DoubleSolenoid piston = RobotMap.gripsGripDBL_Solenoid;
    private boolean Position = false;
    public void initDefaultCommand() {
    	setDefaultCommand(new Grip_Out());
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Object grip;

	public void In() {
		
		piston.set(DoubleSolenoid.Value.kForward);
		Position = true;
		// TODO Auto-generated method stub
		
	}
	public void Out() {
		piston.set(DoubleSolenoid.Value.kReverse);
		Position = false;
	}
	public void Move(){
		if(Position == false){
			In();
		}else if(Position==true){
			Out();
		}else{
				piston.set(DoubleSolenoid.Value.kOff);
		}
	}
}
