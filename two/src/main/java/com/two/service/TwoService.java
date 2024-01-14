package com.two.service;

import com.two.mapper.TwoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dings
 * @since 2024/1/13 15:41
 */
@Service
public class TwoService {
    @Autowired
    private TwoMapper mapper;
    public String two() {
        System.out.println("ser");
        return mapper.two();
    }
}
