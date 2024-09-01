package com.flower.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.flower.common.utils.PageUtils;
import com.flower.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * ???Է??
 *
 * @author alice
 * @email 1162359046@qq.com
 * @date 2024-09-01 21:48:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

