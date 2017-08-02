package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 广告计划
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class AdPlan extends BaseEntity {
    private static final long serialVersionUID = 6692050559131274425L;
    private String name;
    private Gymnasium gymnasium;
    private Advertisement ad;
    private AdSpace adSpace;
    private Date startTime;
    private Date endTime;
    private String interfaceUrl;
}
