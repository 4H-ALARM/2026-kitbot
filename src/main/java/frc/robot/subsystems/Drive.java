// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.DriveConstants.*;

public class Drive extends SubsystemBase {
  SwerveDriveKinematics swerveKinematics;
  /** Creates a new Drive. */
  public Drive() {
    swerveKinematics = new SwerveDriveKinematics(
      LEFT_FRONT_SWERVE_MODULE_POSITION,
      RIGHT_FRONT_SWERVE_MODULE_POSITION,
      LEFT_BACK_SWERVE_MODULE_POSITION,
      RIGHT_BACK_SWERVE_MODULE_POSITION
    );
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

