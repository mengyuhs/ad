package com.healspace.ad.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * AdType
 *
 * @author mengyu
 * @since 2017/8/2
 */
@AllArgsConstructor
public enum AdType {

    TOP("top", "顶部"),
    LEFT("left", "左侧"),
    RIGHT("right", "右侧"),
    BOTTOM("bottom", "底部"),
    CENTER("center", "中间");

    @Getter private final String key;
    @Getter private final String name;

}
