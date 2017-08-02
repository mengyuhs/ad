package com.healspace.ad.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * AdPlan
 *
 * @author mengyu
 * @since 2017/8/2
 */
@Getter
@Setter
@EqualsAndHashCode
public class AdPlan implements Serializable {
    private static final long serialVersionUID = 8002125653810912955L;
    private String ad;

}
