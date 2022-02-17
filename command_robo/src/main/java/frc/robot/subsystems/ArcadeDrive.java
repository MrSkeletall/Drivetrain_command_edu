// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArcadeDrive extends SubsystemBase {
   //left
   public WPI_TalonSRX leftMotor1 = new WPI_TalonSRX(0);
   public WPI_TalonSRX leftMotor2 = new WPI_TalonSRX(1);
   public MotorControllerGroup leftMotorGroup = new MotorControllerGroup(leftMotor1, leftMotor2);
   //right
   public WPI_TalonSRX rightMotor1 = new WPI_TalonSRX(2);
   public WPI_TalonSRX rightMotor2 = new WPI_TalonSRX(3);
   public MotorControllerGroup rightMotorGroup = new MotorControllerGroup(rightMotor1, rightMotor2);
    //drive is a movie staring umm
   //DifferentialDrive dif_drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);



  /** Creates a new ArcadeDrive
   *. */
  public ArcadeDrive() {
    leftMotorGroup.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void setMotars(Joystick joy1, double axisScale){
    double axisX = joy1.getRawAxis(1);
    double zRot = joy1.getRawAxis(2);
    double xSpeed = (axisX * axisScale);
    
    double rotSpeed = zRot * axisScale;

    //dif_drive.arcadeDrive(xSpeed, rotSpeed);
  }

  
}
