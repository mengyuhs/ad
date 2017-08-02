package com.healspace.ad.api;

import com.healspace.ad.entity.Advertisement;

import java.util.List;

/**
 * AdService
 *
 * @author mengyu
 * @since 2017/8/2
 */
public interface AdService {

    List<Advertisement> getAdvertisements();

}
