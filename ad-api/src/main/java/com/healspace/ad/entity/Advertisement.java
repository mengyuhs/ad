package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Advertisement
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class Advertisement extends BaseEntity {
    private static final long serialVersionUID = 1693474701413761845L;
    private String name;
    private Integer type;
    private RedPacket redPacket;
    private String thumb;
    private String video;

}
