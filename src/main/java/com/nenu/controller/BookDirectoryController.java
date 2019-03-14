package com.nenu.controller;

import com.nenu.domain.TbBook;
import com.nenu.domain.TbBookDirectory;
import com.nenu.mapper.TbBookDirectoryMapper;
import com.nenu.mapper.TbBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@Transactional
@RequestMapping(value="/bookDirectory/")
public class BookDirectoryController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private TbBookDirectoryMapper tbBookDirectoryMapper;
    @Autowired
    private TbBookMapper tbBookMapper;

    @RequestMapping(value="showAddBookChapter/{id}",method = RequestMethod.GET)
    public String showAddBookChapter(@PathVariable("id")int id, Model model) {
        Example example = new Example(TbBook.class);
        example.createCriteria().andEqualTo("id",id);
        List<TbBook> tbBooks = tbBookMapper.selectByExample(example);
        if(!tbBooks.isEmpty()) {
            model.addAttribute("tbBook",tbBooks.get(0));
        }

        return "createBookChapter";
    }
    @RequestMapping(value="addBookChapter",method = RequestMethod.POST)
    public String addBookChapter(TbBookDirectory tbBookDirectory, Model model) {

        tbBookDirectory.setbDate(new Date());
        tbBookDirectoryMapper.insert(tbBookDirectory);

        return "createBookChapter";
    }


}
