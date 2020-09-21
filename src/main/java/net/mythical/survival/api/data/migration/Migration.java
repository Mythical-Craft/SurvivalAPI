package net.mythical.survival.api.data.migration;

public interface Migration {

    void start();

    void stop();

    void migrate(MigrateData data);
}
