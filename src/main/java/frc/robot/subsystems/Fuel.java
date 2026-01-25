// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import static frc.robot.Constants.FuelConstants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Fuel extends SubsystemBase {
  private final SparkMax feederRoller;
  private final SparkMax intakeLauncherRoller;

  /** Creates a new Fuel. */
  public Fuel() {
    // initialize the motors
    intakeLauncherRoller = new SparkMax(INTAKE_LAUNCHER_MOTOR_ID, MotorType.kBrushed);
    feederRoller = new SparkMax(FEEDER_MOTOR_ID, MotorType.kBrushed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
