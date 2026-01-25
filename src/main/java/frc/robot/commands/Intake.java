// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Fuel;
import static frc.robot.Constants.FuelConstants.*;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Intake extends Command {
  Fuel fuelSubsystem;
  /** Creates a new Intake. */
  public Intake(Fuel fuelSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(fuelSubsystem);
    this.fuelSubsystem=fuelSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    fuelSubsystem.setIntakeLauncherRoller(INTAKING_INTAKE_VOLTAGE);
    fuelSubsystem.setFeederRoller(INTAKING_FEEDER_VOLTAGE);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    fuelSubsystem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
