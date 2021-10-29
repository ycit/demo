package com.ycit.demo.service;

import com.ycit.demo.bean.dto.UserQuery;
import com.ycit.demo.bean.po.User;
import com.ycit.demo.bean.po.UserExample;
import com.ycit.demo.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author racy
 * @date 2021/10/28
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public List<User> finds(UserQuery userQuery) {
        String name = userQuery.getName();
        String email = userQuery.getEmail();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameEqualTo(name);
        }
        if (StringUtils.isNotBlank(email)) {
            criteria.andEmailEqualTo(email);
        }
        return userMapper.selectByExample(userExample);
    }

}
