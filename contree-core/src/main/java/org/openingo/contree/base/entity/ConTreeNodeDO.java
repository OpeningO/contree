package org.openingo.contree.base.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.openingo.mybatisplus.extension.ModelX;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 树节点数据
 * </p>
 *
 * @author Qicz
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_con_tree_node")
public class ConTreeNodeDO extends ModelX<ConTreeNodeDO> {

    private static final long serialVersionUID=1L;
    

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 节点id
     */
    private String nodeId;

    /**
     * 父节点id，默认为0
     */
    private String rootNodeId;

    /**
     * 树code
     */
    private String treeCode;

    /**
     * 节点图标uri
     */
    private String nodeIcon;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 1可见0不可见
     */
    private Boolean nodeVisible;

    /**
     * 节点顺序
     */
    private Integer nodeOrder;

    /**
     * 节点提示文字
     */
    private String nodeTips;

    /**
     * 扩展信息【json】
     */
    private String nodeExtension;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
