package com.healspace.ad.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 红包类型
 *
 * @author mengyu
 * @since 2017/8/2
 */
@AllArgsConstructor
public enum RedPacketType {

    FIXED(1, "固定金额"),
    RANDOM(2, "随机金额");

    @Getter private final Integer id;
    @Getter private final String name;

}
