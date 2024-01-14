package com.one.service;

import com.one.mapper.OneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author dings
 * @since 2024/1/13 15:38
 */
@Service
@RequiredArgsConstructor
public class OneService {
    private final OneMapper mapper;
    public String one() {
        return mapper.one();
    }
}
