package com.App.Spotify_clone.usercontext.mapper;


import com.App.Spotify_clone.usercontext.ReadUserDTO;
import com.App.Spotify_clone.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
