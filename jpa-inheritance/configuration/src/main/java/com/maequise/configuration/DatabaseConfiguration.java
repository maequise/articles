package com.maequise.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.hibernate.autoconfigure.HibernateProperties;
import org.springframework.boot.jpa.autoconfigure.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    @Bean
    public DataSource dataSource() {
        var conf = new HikariConfig();
        conf.setJdbcUrl("jdbc:mariadb://localhost:3306/test_db");
        conf.setUsername("test_user");
        conf.setPassword("test_password");

        return new HikariDataSource(conf);
    }

    @Bean
    public JpaProperties jpaProperties() {
        var p = new JpaProperties();
        p.setShowSql(true);
        return p;
    }

    @Bean
    public HibernateProperties hibernateProperties() {
        var p = new HibernateProperties();

        p.setDdlAuto("validate");

        return p;
    }
}
