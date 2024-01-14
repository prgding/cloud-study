package com.two.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author dings
 * @since 2024/1/13 15:40
 */
@Repository
public class TwoMapper {
    public String two() {
        System.out.println("mapper");
        return "twoMapper";
    }
}
