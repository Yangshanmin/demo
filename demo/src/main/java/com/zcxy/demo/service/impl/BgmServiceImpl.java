package com.zcxy.demo.service.impl;

import com.zcxy.demo.entity.Bgm;
import com.zcxy.demo.dao.BgmDao;
import com.zcxy.demo.service.BgmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Bgm)表服务实现类
 *
 * @author makejava
 * @since 2018-12-22 15:39:04
 */
@Service("bgmService")
public class BgmServiceImpl implements BgmService {
    @Resource
    private BgmDao bgmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Bgm queryById(String id) {
        return this.bgmDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Bgm> queryAllByLimit(int offset, int limit) {
        return this.bgmDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bgm 实例对象
     * @return 实例对象
     */
    @Override
    public Bgm insert(Bgm bgm) {
        this.bgmDao.insert(bgm);
        return bgm;
    }

    /**
     * 修改数据
     *
     * @param bgm 实例对象
     * @return 实例对象
     */
    @Override
    public Bgm update(Bgm bgm) {
        this.bgmDao.update(bgm);
        return this.queryById(bgm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.bgmDao.deleteById(id) > 0;
    }
}