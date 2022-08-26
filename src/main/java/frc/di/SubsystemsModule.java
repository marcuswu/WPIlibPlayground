package frc.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import frc.robot.subsystems.ExampleSubsystem;

@Module
public class SubsystemsModule {
    @Singleton
    @Provides
    public ExampleSubsystem provideExampleSubsystem() {
        return new ExampleSubsystem();
    }
}
