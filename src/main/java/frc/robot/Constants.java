package frc.robot;

import static edu.wpi.first.units.Units.Inches;

import edu.wpi.first.math.geometry.Translation2d;

public final class Constants {
    public static final class DriveConstants {
        // drive constants
         public static final double CHASSIS_WIDTH_INCHES = 37;
        public static final double CHASSIS_DEPTH_INCHES = 26;
        
        // measurement is the offset of the swerve from the edge of the chassis
        public static final double SWERVE_OFFSET_INCHES = 2.0 + 11.0/16.0;

        public static final Translation2d LEFT_FRONT_SWERVE_MODULE_POSITION = new Translation2d(Inches.of(CHASSIS_DEPTH_INCHES/2 - SWERVE_OFFSET_INCHES), Inches.of(CHASSIS_WIDTH_INCHES/2 - SWERVE_OFFSET_INCHES));
        public static final Translation2d RIGHT_FRONT_SWERVE_MODULE_POSITION = new Translation2d(Inches.of(CHASSIS_DEPTH_INCHES/2 - SWERVE_OFFSET_INCHES), Inches.of(CHASSIS_WIDTH_INCHES/2 - SWERVE_OFFSET_INCHES).unaryMinus());
        public static final Translation2d LEFT_BACK_SWERVE_MODULE_POSITION = new Translation2d(Inches.of(CHASSIS_DEPTH_INCHES/2 - SWERVE_OFFSET_INCHES).unaryMinus(), Inches.of(CHASSIS_WIDTH_INCHES/2 - SWERVE_OFFSET_INCHES));
        public static final Translation2d RIGHT_BACK_SWERVE_MODULE_POSITION = new Translation2d(Inches.of(CHASSIS_DEPTH_INCHES/2 - SWERVE_OFFSET_INCHES).unaryMinus(), Inches.of(CHASSIS_WIDTH_INCHES/2 - SWERVE_OFFSET_INCHES).unaryMinus());
    }

    public static final class FuelConstants {
        // Motor controller IDs
        public static final int FEEDER_MOTOR_ID = 1;
        public static final int INTAKE_LAUNCHER_MOTOR_ID = 2;
        // Current limit constants
        public static final int FEEDER_MOTOR_CURRENT_LIMIT = 60;
        public static final int LAUNCHER_MOTOR_CURRENT_LIMIT = 60;
        //Motor Volatges for intake and feeder
        public static final double INTAKING_INTAKE_VOLTAGE = 10;
        public static final double INTAKING_FEEDER_VOLTAGE = -12;

        public static final double SHOOTING_FEEDER_VOLTAGE = 9;
        public static final double SHOOTING_LAUNCHER_VOLTAGE = 10.6;

        public static final double EJECT_FEEDER_VOLTAGE = -INTAKING_FEEDER_VOLTAGE;
        public static final double EJECTING_INTAKE_VOLTAGE = -INTAKING_INTAKE_VOLTAGE;
    }

    public static final class ControllerConstants {
        // Controller constants
        public static final int CONTROLLER_PORT = 0;
    }
}
