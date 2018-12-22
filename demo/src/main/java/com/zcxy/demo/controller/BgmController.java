package com.zcxy.demo.controller;

import com.zcxy.demo.entity.Bgm;
import com.zcxy.demo.service.BgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Bgm)表控制层
 *
 * @author makejava
 * @since 2018-12-22 15:39:08
 */
@Controller
@RequestMapping("/bgm")
public class BgmController {

    @Autowired
    private BgmService bgmService;

    @GetMapping("selectOne")
    public Bgm selectOne(String id) {
        return this.bgmService.queryById(id);
    }


    @RequestMapping("/index")
    public String index() {
        return "/views/bgm";
    }

    @RequestMapping("/add")
    public String add (Bgm bgm) {
        bgm.setId("111");
        bgmService.insert(bgm);
        return "成功!";
    }

}