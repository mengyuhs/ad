package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 广告流量记录
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class AdViewRecord extends BaseEntity {
    private static final long serialVersionUID = 3325446072828709870L;
    private Advertisement ad;   // 广告信息
    private Member member;      // 会员信息
    private String viewTime;    // 浏览时间
    private Float redPacket;    // 红包领取情况

}
