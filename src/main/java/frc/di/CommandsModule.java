package frc.di;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import frc.robot.commands.ExampleCommand;

@Module
public class CommandsModule {
    @Singleton
    @Provides
    public ExampleCommand providExampleCommand() {
        return new ExampleCommand();
    }
}
