package com.travelremix.demo.Services;
import com.travelremix.demo.Models.User;
import com.travelremix.demo.DTOs.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private User convertToEntity(UserDTO userDTO) {
        return new User(
                userDTO.getUserId(),
                userDTO.getUsername(),
                userDTO.getPassword(),
                userDTO.getEmail(),
                userDTO.getFirstName(),
                userDTO.getLastName()
        );
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName()
        );
    }
}
