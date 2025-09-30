// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class RobotContainer {
  MotorSubsystem KrakenX60Run = new MotorSubsystem();

  public RobotContainer() {
    KrakenX60Run.runKrakenX60();
  }

  public Command getAutonomousCommand() {
    return Commands.runOnce(() -> {
      System.out.println("Autos have begun!");
    });
  }
}
