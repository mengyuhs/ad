package com.healspace.ad.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = -8302825402124083286L;
    private String id;
    private Date createTime;
    private Date updateTime;
}
