// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//To do import libraries for Victor SPX
import frc.robot.Constants;

/*
We are using two Cim motors
Victor SPX motor controllers
Arcade drive to control
*/
public class DriveBase extends SubsystemBase {
  //Motor Controllers
  private final Talon leftLeader = new Talon(Constants.FRONT_LEFT_DRIVE);
  private final Talon rightLeader = new Talon(Constants.FRONT_RIGHT_DRIVE);

  private final DifferentialDrive drive  = new DifferentialDrive(leftLeader, rightLeader);
  /** Creates a new DriveBase. */
  public DriveBase() {}//end DriveBase constructor

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }//end periodic method

  public void arcadeDrive(double throttle, double rotation){
    rotation *=-1;
    drive.arcadeDrive(throttle, rotation);
  }
}//end DriveBaseClass
