package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 角色
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public class Role extends BaseEntity {
    private static final long serialVersionUID = 123220996758721766L;
    private String name;
    private List<String> privileges;
}
