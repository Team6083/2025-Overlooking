// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstant;

public class ArmSubsystem extends SubsystemBase {
	/** Creates a new ArmSubsystem. */

	private VictorSP rotateMotor;
	private VictorSP stretchMotor;
	private PIDController armRotaController;
	private PIDController armStretchController;
	private Encoder armRotateEncoder;
	private Encoder armStretchEncoder;

	public ArmSubsystem() {
		stretchMotor = new VictorSP(ArmConstant.kArmStretchMotorChannel);
		rotateMotor = new VictorSP(ArmConstant.kArmRotateMotorChannel);
		armStretchEncoder = new Encoder(ArmConstant.kArmStretchEncoderChannelA, ArmConstant.kArmStretchEncoderChannelB);
		armRotateEncoder = new Encoder(ArmConstant.kArmRotateEncoderChannelA, ArmConstant.kArmRotateEncoderChannelB);
		armStretchController = new PIDController(ArmConstant.kSp, ArmConstant.kSi, ArmConstant.kSd);
		armRotaController = new PIDController(ArmConstant.kRp, ArmConstant.kRi, ArmConstant.kRd);
	}

	private void setStretchVoltage(double voltage) {
		stretchMotor.setVoltage(voltage);
	}

	private void setRotateVoltage(double voltage) {
		rotateMotor.setVoltage(voltage);
	}

	public void armStretch(double setpoint) {
		double measurement = armStretchEncoder.get();
		setStretchVoltage(armStretchController.calculate(measurement, setpoint));
	}

	public void armStretchStop() {
		setStretchVoltage(0);
	}

	public void armRotated(double setpoint) {
		double measurement = armRotateEncoder.get();
		setRotateVoltage(armRotaController.calculate(measurement, setpoint));
	}

	public void armRotateStop() {
		setRotateVoltage(0);
	}

}