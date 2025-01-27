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
	private Encoder armRotatEncoder;
	private Encoder armStretchEncoder;

	public ArmSubsystem() {
		stretchMotor = new VictorSP(ArmConstant.kArmStretchMotorChannel);
		rotateMotor = new VictorSP(ArmConstant.kArmRotateMotorChannel);
		armStretchEncoder = new Encoder(ArmConstant.kArmStretchEncoderChannelA, ArmConstant.kArmStretchEncoderChannelB);
		armRotatEncoder = new Encoder(ArmConstant.kArmRotateEncoderChannelA, ArmConstant.kArmRotateEncoderChannelB);
		armStretchController = new PIDController(0, 0, 0);
		armRotaController = new PIDController(0, 0, 0);
	}

	private void setStretchVoltage(double voltage) {
		stretchMotor.setVoltage(voltage);
	}

	private void setRotateVoltage(double voltage) {
		rotateMotor.setVoltage(voltage);
	}

	private void armStretch(double setpoint) {
		double measurement = armStretchEncoder.get();
		setStretchVoltage(armStretchController.calculate(measurement, setpoint));
	}

	private void armStretchStop() {
		setStretchVoltage(0);
	}

	private void armRotated(double setpoint) {
		double measurement = armRotatEncoder.get();
		setRotateVoltage(armRotaController.calculate(measurement, setpoint));
	}

	private void armRotateStop() {
		setRotateVoltage(0);
	}

}