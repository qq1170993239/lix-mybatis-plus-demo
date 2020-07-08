package cn.lix.test.code.generator.service.impl;

import cn.lix.test.code.generator.model.entity.TblPermission;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lix.test.code.generator.dao.TblPermissionDAO;
import cn.lix.test.code.generator.service.TblPermissionService;
import org.springframework.stereotype.Service;

/**
 * 权限表(tbl_permission)表服务实现类
 *
 * @author lix
 * @since 2020-07-08 10:45:03
 */
@Service("tblPermissionService")
public class TblPermissionServiceImpl extends ServiceImpl<TblPermissionDAO, TblPermission> implements TblPermissionService {

}