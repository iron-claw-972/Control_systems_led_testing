package frc.robot.subsystems.PhotoelectricSensor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// UNABLE TO WORK: Reason is because of hardware as the voltage drop is not significant enough
public class PhotoelectricSensor extends SubsystemBase {
    private final DigitalInput inputPin;

    public PhotoelectricSensor(int channel) {
        inputPin = new DigitalInput(channel);
    }

    @Override
    public void periodic() {
        boolean status = inputPin.get();

        if (!status) {
            // grounded
            //System.out.println("GROUNDED");
        } else {
            // not grounded
            //System.out.println("NOT GROUNDED");
        }
    }
}
