package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 健身馆门店
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class Gymnasium extends BaseEntity {
    private static final long serialVersionUID = -7403433353120241900L;
    private String name;        // 门店名称
    private String address;     // 门店地址

}
