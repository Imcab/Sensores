// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  int DioPort = 0;
  DigitalInput BeamBreakerSensor = new DigitalInput(DioPort);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {

    Boolean triggerSensor = BeamBreakerSensor.get();

    if (!triggerSensor) {
      SmartDashboard.putBoolean("SENSOR", false);
      System.out.println("El sensor esta detectando algo");
    }else{
      SmartDashboard.putBoolean("SENSOR", true);
      System.out.println("El sensor no esta detectando nada");
    }
  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
