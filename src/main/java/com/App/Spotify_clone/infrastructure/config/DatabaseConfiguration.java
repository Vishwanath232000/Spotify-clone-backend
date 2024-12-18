package com.App.Spotify_clone.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "com.App.Spotify_clone.usercontext.repository", "com.App.Spotify_clone.catalogcontext.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {

}
