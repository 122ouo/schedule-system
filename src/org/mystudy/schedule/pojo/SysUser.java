package org.mystudy.schedule.pojo;

import java.io.Serial;
import java.io.Serializable;

import lombok.*;

/*
* 1 实体类的类名和表格名称应该对应 (对应不是一致)
* 2 实体类的属性名和表格的列名应该对应
* 3 每个属性必须是私有的
* 4 每个属性都应该具备 getter setter
* 5 必须具备无参构造器
* 6 应该实现序列化接口 (缓存   分布式项目数据传递   可能会将对象序列化)
* 7 应该重写类的 hashcode 和 equals 方法
* 8 toString是否重写都可以
*
* 使用lombok帮助我们生成 getter setter  全参构造 无参构造 equals hashcode toString
*   lombok 使用步骤
*       1 检查idea是否已经安装了lombok插件
*       2 检查是否勾选了 enable annotation processer
*       3 导入lombok的依赖 在实体类上添加注解
* */




@AllArgsConstructor //全参构造
@NoArgsConstructor  //无参构造
@Data   //getter setter equals hashcode toString
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;


}
