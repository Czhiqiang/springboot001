package com.example.springboot001.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("menus")
public class Menus {
    @TableId(type = IdType.AUTO)
    private int id;
    private String pic;
    private String name;
    private String url;
}
