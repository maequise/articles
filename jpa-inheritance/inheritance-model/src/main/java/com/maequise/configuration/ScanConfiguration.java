package com.maequise.configuration;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import(DatabaseConfiguration.class)
@EntityScan("com.maequise.entities")
@EnableJpaRepositories(basePackages = "com.maequise.repositories")
public class ScanConfiguration {
}
