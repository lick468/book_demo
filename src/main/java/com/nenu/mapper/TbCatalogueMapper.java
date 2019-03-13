package com.nenu.mapper;

import com.nenu.domain.TbCatalogue;
import tk.mybatis.MyMapper;

import java.util.List;

public interface TbCatalogueMapper extends MyMapper<TbCatalogue> {
    List<TbCatalogue> findAllTbCatalogue();
}