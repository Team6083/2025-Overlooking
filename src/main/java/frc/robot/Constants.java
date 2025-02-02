package frc.robot;

public class Constants {

  public static final class ClimberConstant {
    public static final int kClimberSetpoint = 40;
    public static final double kClimbDownSpeed = -0.35;
    public static final Boolean kclimberMotorInverted = false;
    public static final Boolean kclimberEncoderInverted = true;
  }

  public static final class CoralShooterConstant {
    public static final int kOnboard = 0;
    public static final double kDistanceRange = 4;
    public static final int kShooterMotorChannel = 1;
    public static final double kShooterMotorSpeed = 4;
    public static final Boolean kcoralShooterMotorInverted = false;
  }

  public static final class AlgaeIntakeConstant {
    public static final int kIntakeMotorChannel = 2;
    public static final int kRotateMotorChannel = 1;
    public static final double kIntakeVoltage = 6.0;
    public static final double kReIntakeVoltage = 3.0;
    public static final double kUpIntakeVoltage = 12.0;
    public static final double kDownIntakeVoltage = -12.0;
    public static final Boolean kIntakeMotorInverted = false;
    public static final Boolean krotateIntakeMotorInverted = false;
  }

  public static final class RampConstant {
    public static final Boolean rampmotorInverted = false;
  }

}
