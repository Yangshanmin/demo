package com.zcxy.demo.entity;

import java.io.Serializable;

/**
 * (Bgm)实体类
 *
 * @author makejava
 * @since 2018-12-22 15:39:04
 */
public class Bgm implements Serializable {
    private static final long serialVersionUID = -98654480721289861L;
    
    private String id;
    
    private String author;
    
    private String name;
    //播放地址
    private String path;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}