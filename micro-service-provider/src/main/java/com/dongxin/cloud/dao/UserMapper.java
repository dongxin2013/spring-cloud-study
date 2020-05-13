package com.dongxin.cloud.dao;

import com.dongxin.cloud.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author dongxin
 * @since 2019-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
