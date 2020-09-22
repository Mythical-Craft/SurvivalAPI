package net.mythical.survival.api.data.database;

import net.mythical.lib.com.zaxxer.hikari.HikariDataSource;

public interface DatabaseManager {

    void registerDatasource(String name, HikariDataSource dataSource);

    void unregisterDatasource(String name);
}
