package com.App.Spotify_clone.catalogcontext.application.vo;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {
}
