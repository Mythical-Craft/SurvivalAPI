package net.mythical.survival.api.data.database;

import net.mythical.lib.com.zaxxer.hikari.HikariDataSource;

import java.sql.ResultSet;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface Database {

    void start(HikariDataSource dataSource);

    void end(HikariDataSource dataSource);

    CompletableFuture<Void> execute(HikariDataSource dataSource, String sqlQuery);

    CompletableFuture<Void> query(HikariDataSource dataSource, String sqlQuery, Consumer<ResultSet> consumer);

    String getType();

}
