package workforcemanger.workforce.service.UserService;

import workforcemanger.workforce.dto.UserDTO;
import workforcemanger.workforce.entity.User;
import workforcemanger.workforce.helper.Validator;
import workforcemanger.workforce.mapper.UserDTOMapper;
import workforcemanger.workforce.repository.User.UserRepositoryImpl;

public class UserService {
    final UserRepositoryImpl userRepository = new UserRepositoryImpl();
    final UserDTOMapper userDTOMapper = new UserDTOMapper();
    public UserDTO createUser(UserDTO userDTO) {
        try {
//            boolean flag = Validator.validateAllFields(userDTO.getUserName(), userDTO.getPassword(), userDTO.getEmail());
//            if (flag) {
//
//            }else {
//                throw new Exception();
//            }
            User user = userDTOMapper.DtoToUser(userDTO);
            return userDTOMapper.UserToDto(userRepository.create(user));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public UserDTO login(UserDTO userDTO) {
        try {
            if (Validator.validateEmail(userDTO.getEmail())
                    && userDTO.getPassword() != null
                    && !userDTO.getPassword().isEmpty()) {
                User user = userRepository.Login(userDTO.getEmail(), userDTO.getPassword());
                if (user != null) {
                    return userDTOMapper.UserToDto(user);
                }
            }
            return null;

        } catch (Exception e) {
            throw new RuntimeException("Error during user login", e);
        }
    }


}
