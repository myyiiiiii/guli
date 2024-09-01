package com.flower.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flower.common.utils.PageUtils;
import com.flower.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author alice
 * @email 1162359046@qq.com
 * @date 2024-09-01 21:48:15
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

