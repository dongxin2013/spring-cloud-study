package com.dongxin.cloud.service.impl;

import com.dongxin.cloud.entity.User;
import com.dongxin.cloud.dao.UserMapper;
import com.dongxin.cloud.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author dongxin
 * @since 2019-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
