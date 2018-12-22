package com.zcxy.demo.service;

import com.zcxy.demo.entity.Bgm;
import java.util.List;

/**
 * (Bgm)表服务接口
 *
 * @author makejava
 * @since 2018-12-22 15:39:04
 */
public interface BgmService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Bgm queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Bgm> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bgm 实例对象
     * @return 实例对象
     */
    Bgm insert(Bgm bgm);

    /**
     * 修改数据
     *
     * @param bgm 实例对象
     * @return 实例对象
     */
    Bgm update(Bgm bgm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}