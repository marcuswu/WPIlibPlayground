package frc.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
    modules = {
        SubsystemsModule.class,
        CommandsModule.class,
        RobotModule.class
    }
)
interface RobotComponent {
    @Component.Builder
    interface Builder {
        public Builder application();
        public RobotComponent build();
    }
}
