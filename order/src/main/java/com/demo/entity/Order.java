package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("order")
public class Order {
    private Long id;
    private Long goodsId;
}
