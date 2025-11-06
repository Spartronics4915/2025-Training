// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.ElevatorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    private ElevatorSubsystem elevator = new ElevatorSubsystem();

    private final CommandXboxController driverController = new CommandXboxController(0);

    public RobotContainer() {
        configureBindings();
    }

    public Command getAutonomousCommand() {
        return Commands.runOnce(() -> {
            System.out.println("Autos");
        });
    }

    public void configureBindings() {
        driverController.a().toggleOnTrue(elevator.incrementSetpointCommand(0.05));
        
        driverController.b().toggleOnTrue(elevator.incrementSetpointCommand(-0.05));
    }
}
