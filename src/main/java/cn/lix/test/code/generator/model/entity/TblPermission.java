package cn.lix.test.code.generator.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 权限表(tbl_permission)表实体类
 *
 * @author lix
 * @since 2020-07-08 10:37:14
 */
public class TblPermission {


    //自增主键
    @TableId
    @TableField("id")
    private Integer id;


    //名称    
    @TableField("name")
    private String name;


    //权限    
    @TableField("permission")
    private String permission;


    //url    
    @TableField("url")
    private String url;


    //描述    
    @TableField("description")
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}