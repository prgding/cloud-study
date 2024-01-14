package com.one.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author dings
 * @since 2024/1/13 15:38
 */
@Repository
public class OneMapper {
    public String one() {
        System.out.println("oneMapper");
        return "oneMapper";
    }
}
