package com.kosasih.welltech;

import com.kosasih.welltech.WelltechApp;
import com.kosasih.welltech.config.AsyncSyncConfiguration;
import com.kosasih.welltech.config.EmbeddedElasticsearch;
import com.kosasih.welltech.config.EmbeddedKafka;
import com.kosasih.welltech.config.EmbeddedSQL;
import com.kosasih.welltech.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { WelltechApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
