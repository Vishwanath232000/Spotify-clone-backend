package com.App.Spotify_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.App.Spotify_clone")
public class SpotifyCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyCloneApplication.class, args);
	}

}
