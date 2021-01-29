/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * ! This is an example program that can be used as a base image to experiment
 * with.
 * 
 * * The extension aaron-bond.better-comments should be installed for comment
 * coloring.
 * 
 * ? This is what a question comment looks like.
 * 
 * // there can also be strikethrough text that looks like this.
 * 
 * TODO: Add more meaningful text here
 * 
 * The TimedRobot class is the the base class that the robot extends from. It
 * gives us the use of these voids.
 */
public class Robot extends TimedRobot {
  /**
   * This is the section above the initialization. It runs first and is used for
   * declaring variables.
   */
  private DifferentialDrive drive;
  private Joystick leftStick;
  private Joystick rightStick;

  /**
   * This is robotInit. It is where most variables are initialized.
   */
  @Override
  public void robotInit() {
    drive = new DifferentialDrive(new WPI_TalonSRX(1), new WPI_TalonSRX(2));
    leftStick = new Joystick(0);
    rightStick = new Joystick(1);
  }

  /**
   * This is called when the robot is disabled. This will probably be used for
   * stopping the compressor.
   */
  @Override
  public void disabledInit() {
  }

  /**
   * This is called once when the robot first enters autonomous mode. It will
   * probably be used to start the compressor and to start the timer method.
   */
  @Override
  public void autonomousInit() {
  }

  /**
   * This is called every time the robot receives a packet of information from the
   * driver station while the robot is in autonomous mode.
   */
  @Override
  public void autonomousPeriodic() {
  }

  /**
   * This is called once when the robot first enters teleoperated mode
   */
  @Override
  public void teleopInit() {
  }

  /**
   * This function is called every time the robot receives a packet from the
   * driver station while the robot is in teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {
    drive.arcadeDrive(leftStick.getY(), rightStick.getX());
  }
}
