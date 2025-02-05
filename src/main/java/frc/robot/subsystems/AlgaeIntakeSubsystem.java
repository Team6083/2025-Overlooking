// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AlgaeIntakeConstant;

public class AlgaeIntakeSubsystem extends SubsystemBase {
  /** Creates a new ALGAEIntakeSubsystem. */
  private final VictorSP intakeMotor;
  private final VictorSP rotateIntakeMotor;
  private final Timer timer;

  public AlgaeIntakeSubsystem() {

    intakeMotor = new VictorSP(AlgaeIntakeConstant.kIntakeMotorChannel);
    rotateIntakeMotor = new VictorSP(AlgaeIntakeConstant.kRotateMotorChannel);
    timer = new Timer();
    intakeMotor.setInverted(AlgaeIntakeConstant.kIntakeMotorInverted);
  }

  public void setTimer() {
    timer.start();
    if (timer.get() > 8) {
      intakeMotor.setVoltage(AlgaeIntakeConstant.kIntakeVoltage);
    }
  }

  public void setIntakeMotor() {
    intakeMotor.setVoltage(AlgaeIntakeConstant.kIntakeVoltage);
  }

  public void setReIntake() {
    intakeMotor.setVoltage(AlgaeIntakeConstant.kReIntakeVoltage);
  }

  public void setUpIntake() {
    rotateIntakeMotor.setVoltage(AlgaeIntakeConstant.kUpIntakeVoltage);
  }

  public void setDownIntake() {
    rotateIntakeMotor.setVoltage(AlgaeIntakeConstant.kDownIntakeVoltage);
  }

  public void stopRotateIntakeMotor() {
    rotateIntakeMotor.setVoltage(0);
  }


  public Command setUpIntakeCmd() {
    Command cmd = runEnd(this::setUpIntake, this::stopRotateIntakeMotor);
    return cmd;
  }

  public Command setDownIntakeCmd() {
    Command cmd = runEnd(this::setDownIntake, this::stopRotateIntakeMotor);
    return cmd;
  }

  public Command setIntakeMotorCmd() {
    Command cmd = runEnd(this::setUpIntake, this::stopRotateIntakeMotor);
    return cmd;
  }

  public Command setReIntakeMotorCmd() {
    Command cmd = runEnd(this::setUpIntake, this::stopRotateIntakeMotor);
    return cmd;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
