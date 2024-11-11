package com.example.springboot001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot001.entity.Menus;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenusMapper extends BaseMapper<Menus> {

}