package com.healspace.ad.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Advertisement
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
@EqualsAndHashCode
public class Advertisement implements Serializable {
    private static final long serialVersionUID = 1693474701413761845L;
    private String name;
    private String source;

}
