package com.nenu.controller;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nenu.domain.TbBook;
import com.nenu.domain.TbCatalogue;
import com.nenu.mapper.TbBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;


@Controller
@Transactional
@RequestMapping(value="/book/")
public class BookController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    @Autowired
    private TbBookMapper tbBookMapper;
    @RequestMapping(value="/showBookList",method = RequestMethod.GET)
    public String showMain() {
        return "bookList";
    }

   @RequestMapping(value="showCreateBook",method = RequestMethod.GET)
    public String showCreateBook() {
       return "createBook";
    }
    @RequestMapping(value="createBook",method = RequestMethod.POST)
    public String createBook(TbBook book, BindingResult bin, @RequestParam(value = "file0")MultipartFile file, HttpServletRequest request) {
        BufferedOutputStream out = null;//保存图片到目录下
        String fileName = "D:\\IdeaProjects\\book_demo\\src\\main\\webapp\\"+book.getbName()+".jpg";
        try {
            out = new BufferedOutputStream( new FileOutputStream(new File(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        book.setbAuthor("");
        book.setbClick(0);
        book.setbImage(fileName);
        book.setbState(0);
        book.setbWordcount(0);
        book.setbRecommend(0);
        tbBookMapper.insert(book);

        return "bookList";
    }
    @RequestMapping(value="/getBookData",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getBookData(Integer pageSize, Integer offset,String dataId) {
        Map<String, Object> map = new HashMap<String, Object>();
        // PageHelper 使用非常简单，只需要设置页码和每页显示笔数即可
        PageHelper.startPage(offset, pageSize);
        System.out.println(dataId+"========");
        // 设置分页查询条件
        Example example = new Example(TbBook.class);
        PageInfo<TbBook> pageInfo = new PageInfo<>(tbBookMapper.selectByExample(example));

        map.put("total", pageInfo.getTotal());
        map.put("rows", pageInfo.getList());

        return map;
    }

}
