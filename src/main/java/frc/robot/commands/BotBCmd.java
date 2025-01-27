package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.BotBShooterSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class BotBCmd extends Command {
  /** Creates a new CoralShooterInWithAutoStopCmd. */

  private final ArmSubsystem armSubsystem;
  private final BotBShooterSubsystem bShooterSubsystem;

  public BotBCmd(ArmSubsystem armSubsystem , BotBShooterSubsystem bShooterSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.armSubsystem = armSubsystem;
    this.bShooterSubsystem = bShooterSubsystem;
    addRequirements(this.armSubsystem);
    addRequirements(this.bShooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    armSubsystem.armStretchStop();
    armSubsystem.armRotateStop();
    bShooterSubsystem.shooterStop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    coralShooterSubsystem.coralShooterOn();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    armSubsystem.armStretchStop();
    armSubsystem.armRotateStop();
    bShooterSubsystem.shooterStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return coralShooterSubsystem.isGetCoral(); // 是否拿到 Coral
  }
}