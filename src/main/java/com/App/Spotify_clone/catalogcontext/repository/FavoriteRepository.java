package com.App.Spotify_clone.catalogcontext.repository;

import com.App.Spotify_clone.catalogcontext.domain.Favorite;
import com.App.Spotify_clone.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);
}
