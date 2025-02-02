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

  public static final class PowerDistributionConstant {
    // Motor channel
    public static final int kCoralShooterMotorCurrentChannel = 7;
    public static final int kAlgaeIntakeMotorCurrentChannel = 7;
    public static final int kAlgaeRotateMotorCurrentChannel = 7;
    public static final int kClimberMotorCurrentChannel = 7;
    public static final int kRampMotorCurrentChannel = 7;
    // Motor Max Current
    public static final double kCoralShooterMotorMaxCurrent = 40;
    public static final double kAlgaeIntakeMotorMaxCurrent = 40;
    public static final double kAlgaeRotateMotorMaxCurrent = 40;
    public static final double kClimberMotorMaxCurrent = 40;
    public static final double kRampMotorMaxCurrent = 40;
  }

}
