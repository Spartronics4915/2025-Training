package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
    private double setpoint = 0;

    // Your constructor. This is where you should initialize things like motor constants, pid, and motion profiles
    public ElevatorSubsystem() {

    }

    // This runs 50 times per second. Good spot to check if setpoint is within bounds, make the motor move, etc
    public void periodic() {

    }

    public Command incrementSetpointCommand(double change) {
        return Commands.runOnce(() -> {
            this.setpoint += change;
            System.out.println(this.setpoint);
        });
    }

    public double getSetpoint() {
        return setpoint;
    }
}
