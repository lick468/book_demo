package com.nenu.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nenu.domain.TbCatalogue;
import com.nenu.mapper.TbCatalogueMapper;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Transactional
@RequestMapping(value="catalogue")
public class CatalogueController {
    @Autowired
    private TbCatalogueMapper tbCatalogueMapper;

    @RequestMapping(value = "/showCatalogueList", method = RequestMethod.GET)
    public String showMain() {
        return "catalogueList";
    }

    @RequestMapping(value = "/getCatalogueData", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getCatalogueData(Integer pageSize, Integer offset) {
        Map<String, Object> map = new HashMap<String, Object>();
        // PageHelper 使用非常简单，只需要设置页码和每页显示笔数即可
        PageHelper.startPage(offset, pageSize);
        // 设置分页查询条件
        Example example = new Example(TbCatalogue.class);
        PageInfo<TbCatalogue> pageInfo = new PageInfo<>(tbCatalogueMapper.selectByExample(example));

        map.put("total", pageInfo.getTotal());
        map.put("rows", pageInfo.getList());

        return map;
    }

}
