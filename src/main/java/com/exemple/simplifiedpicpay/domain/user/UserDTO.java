package com.exemple.simplifiedpicpay.domain.user;

import java.math.BigDecimal;

public record UserDTO(String name,
                      String document,
                      String email,
                      String password,
                      BigDecimal balance,
                      UserType userType) {
}
