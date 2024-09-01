package com.flower.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flower.common.utils.PageUtils;
import com.flower.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author alice
 * @email 1162359046@qq.com
 * @date 2024-09-01 21:48:15
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

