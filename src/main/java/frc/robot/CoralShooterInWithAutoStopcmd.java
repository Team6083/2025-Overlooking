package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.CoralShooterSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class CoralShooterInWithAutoStopcmd extends Command {
  /** Creates a new CoralShooterInWithAutoStopcmd. */
  
  private final CoralShooterSubsystem coralShooterSubsystem ;
  
  public CoralShooterInWithAutoStopcmd(CoralShooterSubsystem coralShooterSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.coralShooterSubsystem = coralShooterSubsystem;
    addRequirements(this.coralShooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    coralShooterSubsystem.CoralShooterStop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    coralShooterSubsystem.CoralShooterOn();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    coralShooterSubsystem.CoralShooterStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return coralShooterSubsystem.isGetCoral(); // 是否拿到 Coral
  }
}