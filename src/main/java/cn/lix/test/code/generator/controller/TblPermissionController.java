package cn.lix.test.code.generator.controller;



import cn.lix.test.code.generator.model.entity.TblPermission;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.lix.test.code.generator.service.TblPermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 权限表(tbl_permission)表控制层
 *
 * @author lix
 * @since 2020-07-08 10:46:54
 */
@RestController
@RequestMapping("tblPermission")
public class TblPermissionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TblPermissionService tblPermissionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tblPermission 查询实体
     * @return 所有数据
     */
    @GetMapping("/selectAll")
    public R selectAll(Page<TblPermission> page, TblPermission tblPermission) {
        return success(this.tblPermissionService.page(page, new QueryWrapper<>(tblPermission)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tblPermissionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tblPermission 实体对象
     * @return 新增结果
     */
    @PostMapping("/insert")
    public R insert(@RequestBody TblPermission tblPermission) {
        return success(this.tblPermissionService.save(tblPermission));
    }

    /**
     * 修改数据
     *
     * @param tblPermission 实体对象
     * @return 修改结果
     */
    @PutMapping("update")
    public R update(@RequestBody TblPermission tblPermission) {
        return success(this.tblPermissionService.updateById(tblPermission));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/delete")
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tblPermissionService.removeByIds(idList));
    }

}