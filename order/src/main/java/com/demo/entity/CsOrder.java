package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dings
 * @since 2024/3/6 16:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CsOrder {
    private Long id;
    private Long goodsId;
}
