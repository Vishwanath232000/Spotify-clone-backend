package com.App.Spotify_clone.usercontext.repository;

import com.App.Spotify_clone.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findOneByEmail(String email);
}
