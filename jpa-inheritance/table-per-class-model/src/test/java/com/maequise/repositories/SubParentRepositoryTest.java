package com.maequise.repositories;

import com.maequise.configuration.DatabaseConfiguration;
import com.maequise.configurations.ScanConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.maequise.hibernate.profiler.configuration.ProfilerConfiguration;
import org.maequise.hibernate.profiler.core.annotations.ExpectedSelectQuery;
import org.maequise.hibernate.profiler.core.extension.HibernateProfilerExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(ProfilerConfiguration.class)
@ExtendWith({HibernateProfilerExtension.class})
class SubParentRepositoryTest {
    @Autowired
    private SubParentRepository repository;

    @Test
    @DisplayName("test that the fetch EAGER is not enable")
    @ExpectedSelectQuery(1)
    void test_expected_select_query(){
        repository.fetchAll();
    }


}
