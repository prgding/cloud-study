package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dings
 * @since 2024/3/7 15:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String username;
    private String password;
}
