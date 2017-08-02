package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 员工
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class User extends BaseEntity {
    private static final long serialVersionUID = -8665920963540371120L;
    private String name;
    private String desc;
}
