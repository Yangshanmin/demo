package com.zcxy.demo.dao;

import com.zcxy.demo.entity.Bgm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Bgm)表数据库访问层
 *
 * @author makejava
 * @since 2018-12-22 15:39:04
 */
public interface BgmDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Bgm queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Bgm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bgm 实例对象
     * @return 对象列表
     */
    List<Bgm> queryAll(Bgm bgm);

    /**
     * 新增数据
     *
     * @param bgm 实例对象
     * @return 影响行数
     */
    int insert(Bgm bgm);

    /**
     * 修改数据
     *
     * @param bgm 实例对象
     * @return 影响行数
     */
    int update(Bgm bgm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}