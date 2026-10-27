package com.rays.dao;

import com.rays.common.UserContext;
import com.rays.dto.UserDTO;

public interface UserDAOInt {

	UserDTO findByUniqueKey(String string, String login, UserContext userContext);

}
