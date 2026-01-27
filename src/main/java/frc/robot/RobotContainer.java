// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.Eject;
import frc.robot.commands.Intake;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.Fuel;
import static frc.robot.Constants.ControllerConstants.*;

public class RobotContainer {
  public Fuel fuelSubsystem;
  public CommandXboxController controller;

  public RobotContainer() {
    fuelSubsystem = new Fuel();
    controller = new CommandXboxController(CONTROLLER_PORT);
    configureBindings();
  }

  private void configureBindings() {
    controller.rightTrigger().toggleOnTrue(new Intake(fuelSubsystem));
    controller.a().whileTrue(new Shoot(fuelSubsystem));

    controller.x().whileTrue(new Eject(fuelSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }  
}
