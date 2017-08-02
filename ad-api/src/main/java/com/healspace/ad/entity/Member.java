package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 会员
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class Member extends BaseEntity {
    private static final long serialVersionUID = 3894954181304084947L;
    private String name;
    private Integer sex;
    private Integer age;

}
