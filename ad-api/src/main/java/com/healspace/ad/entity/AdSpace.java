package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 广告位
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class AdSpace extends BaseEntity {
    private static final long serialVersionUID = 5902407451479495298L;
    private String name;                // 广告位名称
    private Gymnasium gymnasium;        // 门店信息
    private List<String> equipments;    // 跑步机列表
    private Integer status;             // 广告位状态：启用、停用
}
