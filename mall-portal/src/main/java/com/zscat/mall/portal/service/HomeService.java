package com.zscat.mall.portal.service;


import com.zscat.cms.model.CmsSubject;
import com.zscat.mall.portal.vo.HomeFlashPromotion;
import com.zscat.pms.model.PmsProductCategory;

import java.util.List;

/**
 * 首页内容管理Service
 * Created by zscat on 2019/1/28.
 */
public interface HomeService {


    /**
     * 获取商品分类
     *
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     *
     * @param cateId 专题分类id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);


    HomeFlashPromotion getHomeFlashPromotion();
}
