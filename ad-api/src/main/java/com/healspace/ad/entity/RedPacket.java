package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 红包
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class RedPacket  extends BaseEntity {
    private static final long serialVersionUID = 6697500799968721548L;
    private String name;    // 红包名称
    private Integer type;   // 红包类型
    private Float min;      // 随机红包最低金额
    private Float max;      // 随机红包最高金额
    private Float first;    // 固定红包首次领取金额
    private Float second;   // 固定红包二次领取金额
    private Float third;    // 固定红包三次领取金额
}
