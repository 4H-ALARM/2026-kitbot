package frc.robot;

public final class Constants {
    public static final class DriveConstants {
        // drive constants
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

    }

    public static final class ControllerConstants {
        // Controller constants
        public static final int CONTROLLER_PORT = 0;
    }
}
