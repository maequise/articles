package com.maequise.configurations;

import com.maequise.configuration.DatabaseConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import(DatabaseConfiguration.class)
@EnableJpaRepositories(basePackages = "com.maequise.repositories")
@EntityScan("com.maequise.entities")
public class ScanConfiguration {
}
