package frc.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import frc.robot.RobotContainer;

@Module
public class RobotModule {
    @Singleton
    @Provides
    public RobotContainer provideRobotContainer() {
        return new RobotContainer();
    }
}
