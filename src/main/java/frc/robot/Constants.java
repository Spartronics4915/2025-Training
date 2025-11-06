// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {

    public final class ElevatorConstants {
        public static final int MOTOR_ID = 9;
        public static final int FOLLOWER_ID = 10;

        /**
         * Rotations to meters
         */
        public static final double CONVERSION_FACTOR = (1/9.0) * 0.14044 * 2;

        public static final double MIN_HEIGHT = 0.1;
        public static final double MAX_HEIGHT = 1;
    }

}
