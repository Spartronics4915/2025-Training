package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
    private double setpoint = 0;

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
