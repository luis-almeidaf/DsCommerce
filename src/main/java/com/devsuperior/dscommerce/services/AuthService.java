package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSelfOrAdmin(long UserId) {
        User user = userService.getAuthenticatedUser();

        if (!user.hasRole("ROLE_ADMIN") && !user.getId().equals(UserId)) {
            throw new ForbiddenException("Acesso negado");
        }
    }
}
