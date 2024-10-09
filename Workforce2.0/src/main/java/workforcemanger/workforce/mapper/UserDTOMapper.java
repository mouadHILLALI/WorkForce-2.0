package workforcemanger.workforce.mapper;

import workforcemanger.workforce.dto.UserDTO;
import workforcemanger.workforce.entity.User;

public class UserDTOMapper {
    public UserDTOMapper(){}

    public User DtoToUser(UserDTO userDTO){
        try {
            User user = new User();
            user.setId(userDTO.getId());
            user.setUserName(userDTO.getUserName());
            user.setEmail(userDTO.getEmail());
            user.setPassword(userDTO.getPassword());
            user.setRole(userDTO.getRole());
            user.setPhone(userDTO.getPhone());
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public UserDTO UserToDto(User user) {
        try {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setUserName(user.getUserName());
            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setRole(user.getRole());
            userDTO.setPhone(user.getPhone());
            return userDTO;
        } catch (Exception e) {
            throw new RuntimeException("Error mapping User to UserDTO", e);
        }
    }
}
