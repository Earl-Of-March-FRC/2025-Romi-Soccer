// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RomiDrivetrain;

public class TankDriveCommand extends Command {
  private RomiDrivetrain driveSub;
  private DoubleSupplier left;
  private DoubleSupplier right;

  /** Creates a new TankDriveCommand. */
  public TankDriveCommand(RomiDrivetrain driveSub, DoubleSupplier left, DoubleSupplier right) {

    this.driveSub = driveSub;
    this.left = left;
    this.right = right;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveSub.tankDrive(left, right);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
