package frc.robot;

public class Constants {

  public static final class ClimberConstant {
    public static final int kClimberSetpoint = 40;
    public static final double kClimbDownSpeed = -0.35;
  }

  public static final class CoralShooterConstant {
    public static final int kOnboard = 0;
    public static final double kDistanceRange = 4;
    public static final int kShooterMotorChannel = 1;
    public static final double kShooterMotorSpeed = 4;
  }

  public static final class AlgaeIntakeConstant {
    public static final int kIntakeMotorChannel = 2;
    public static final int kRotateMotorChannel = 1;
    public static final double kIntakeVoltage = 6.0;
    public static final double kReIntakeVoltage = 3.0;
    public static final double kUpIntakeVoltage = 12.0;
    public static final double kDownIntakeVoltage = -12.0;
  }

  public static final class ArmConstant {
    public static final int kArmStretchMotorChannel = 0;
    public static final int kArmRotateMotorChannel = 0;
    public static final int kArmStretchMotorVolatge = 4;
    public static final int kArmRotateMotorVoltage = 4;
    public static final int kArmStretchEncoderChannelA = 0;
    public static final int kArmStretchEncoderChannelB = 0;
    public static final int kArmRotateEncoderChannelA = 0;
    public static final int kArmRotateEncoderChannelB = 0;
    public static final double kRp = 0;
    public static final double kRi = 0;
    public static final double kRd = 0;
    public static final double kSp = 0;
    public static final double kSi = 0;
    public static final double kSd = 0;
    public static final double kArmStretchSetpointL1 = 0;
    public static final double kArmStretchSetpointL2 = 0;
    public static final double kArmStretchSetpointL3 = 0;
    public static final double kArmStretchSetpointL4 = 0;
    public static final double kArmRotateSetpointL1 = 0;
    public static final double kArmRotateSetpointL2 = 0;
    public static final double kArmRotateSetpointL3 = 0;
    public static final double kArmRotateSetpointL4 = 0;
  }

  public static final class BotBShooterConstant {
    public static final int kBotBShooterUpMotorChannel = 0;
    public static final int kBotBShooterDownMotorChannel = 0;
    public static final int kBotBShooterRotateMotorChannel = 0;
    public static final int kBotBshooterRotateEncoderChannelA = 1;
    public static final int kBotBshooterRotateEncoderChannelB = 1;
    public static final double kBotBShooterInVoltage = 4;
    public static final double kBotBShooterOutVoltage = 4;
    public static final int kp = 0;
    public static final int ki = 0;
    public static final int kd = 0;
  }

  public static final class PowerDistributionConstant {
    // Motor channel
    public static final int kCoralShooterMotorCurrentchannel = 7;
    public static final int kAlgaeIntakeMotorCurrentchannel = 7;
    public static final int kAlgaeRotateMotorCurrentchannel = 7;
    public static final int kClimberMotorCurrentchannel = 7;
    public static final int kRampMotorCurrentchannel = 7;
    // Motor Max Current
    public static final double kCoralShooterMotorMaxCurrent = 40;
    public static final double kAlgaeIntakeMotorMaxCurrent = 40;
    public static final double kAlgaeRotateMotorMaxCurrent = 40;
    public static final double kClimberMotorMaxCurrent = 40;
    public static final double kRampMotorMaxCurrent = 40;
  }

}
