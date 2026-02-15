// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.TunerConstants;

public class Drive extends SubsystemBase {
  SwerveDriveKinematics swerveKinematics;
  private final SwerveModule[] modules = new SwerveModule[4];
  private final Gyro gyro;

  /** Creates a new Drive. */
  public Drive() {
    swerveKinematics = new SwerveDriveKinematics(getModuleTranslations());
    modules[0] = new SwerveModule(TunerConstants.FrontLeft);
    modules[1] = new SwerveModule(TunerConstants.FrontRight);
    modules[2] = new SwerveModule(TunerConstants.BackLeft);
    modules[3] = new SwerveModule(TunerConstants.BackRight);
    gyro = new Gyro();

  }

  @Override
  public void periodic() {
    gyro.periodic();
    // This method will be called once per scheduler run
  }

  public static Translation2d[] getModuleTranslations() {
    return new Translation2d[] {
      new Translation2d(TunerConstants.FrontLeft.LocationX, TunerConstants.FrontLeft.LocationY),
      new Translation2d(TunerConstants.FrontRight.LocationX, TunerConstants.FrontRight.LocationY),
      new Translation2d(TunerConstants.BackLeft.LocationX, TunerConstants.BackLeft.LocationY),
      new Translation2d(TunerConstants.BackRight.LocationX, TunerConstants.BackRight.LocationY),
    };
  }
}
