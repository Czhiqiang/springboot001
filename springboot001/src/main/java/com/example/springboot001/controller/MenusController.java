package com.example.springboot001.controller;

import com.example.springboot001.entity.Menus;
import com.example.springboot001.mapper.MenusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class MenusController {
    @Autowired(required = false)
    private MenusMapper menusMapper;


    @GetMapping("/index/menus")
    public List<Menus> test(){


        return menusMapper.selectList(null);
    }

    @GetMapping("/test01")
    public String tets01(){
        return "12";
    }
}
