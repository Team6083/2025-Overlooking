// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.Rev2mDistanceSensor.Port;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BotBShooterConstant;
import frc.robot.Constants.CoralShooterConstant;
import frc.robot.lib.DistanceSensor;
import frc.robot.lib.DistanceSensorInterface;

public class BotBShooterSubsystem extends SubsystemBase {
    /** Creates a new ArmSubsystem. */

    private VictorSP shooterUpMotor;
    private VictorSP shooterDownMotor;
    private VictorSP shooterRotateMotor;
    private PIDController rotateController;
    private Encoder rotateEncoder;
    private DistanceSensorInterface distanceSensor;

    public BotBShooterSubsystem() {
        shooterUpMotor = new VictorSP(BotBShooterConstant.kBotBShooterUpMotorChannel);
        shooterDownMotor = new VictorSP(BotBShooterConstant.kBotBShooterDownMotorChannel);
        shooterRotateMotor = new VictorSP(BotBShooterConstant.kBotBShooterRotateMotorChannel);
        rotateEncoder = new Encoder
            (BotBShooterConstant.kBotBShooterRotateEncoderChannelA,BotBShooterConstant.kBotBShooterRotateEncoderChannelB);
        rotateController = new PIDController(0, 0, 0);
        distanceSensor = new DistanceSensor(Port.kOnboard);
    }

    private void setShooterMotorVoltage(double voltage) {
        shooterUpMotor.setVoltage(voltage);
        shooterDownMotor.setVoltage(voltage);
    }

    private void setRotateVoltage(double voltage) {
        shooterRotateMotor.setVoltage(voltage);
    }

    private void shooterRotate(double setpoint) {
        double measurement = rotateEncoder.get();
        setRotateVoltage(rotateController.calculate(measurement, setpoint));
    }

    private void shooterIn() {
        setShooterMotorVoltage(BotBShooterConstant.kBotBShooterInVoltage);
    }

    private void shooterOut() {
        setShooterMotorVoltage(BotBShooterConstant.kBotBShooterOutVoltage);
    }

    public void shooterStop() {
        setShooterMotorVoltage(0);
    }

     public boolean isGetCoral() {
    if (distanceSensor.isGetTarget()) { // 碰到目標
      return distanceSensor.getTargetDistance() <= CoralShooterConstant.kDistanceRange
          && distanceSensor.getTargetDistance() > 0;
    }
    return false;
  }

    public Command shooterInCmd() {
        Command cmd = runEnd(this::shooterIn, this::shooterStop);
        return cmd;
    }

    public Command shooterOutCmd() {
        Command cmd = runEnd(this::shooterOut, this::shooterStop);
        return cmd;
    }

}