package com.healspace.ad.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 广告类型
 *
 * @author mengyu
 * @since 2017/8/2
 */
@AllArgsConstructor
public enum AdType {

    TOP(1, "顶部"),
    LEFT(2, "左侧"),
    RIGHT(3, "右侧"),
    BOTTOM(4, "底部"),
    CENTER(5, "中间");

    @Getter private final Integer id;
    @Getter private final String name;

}
