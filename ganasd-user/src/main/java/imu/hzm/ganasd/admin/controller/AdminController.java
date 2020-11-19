package imu.hzm.ganasd.admin.controller;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "管理员操作")
public class AdminController {

    @Resource
    UserService userService;

    @PostMapping(value = "/admin/login")
    @ApiOperation(value = "管理员登陆")
    @ResponseBody
    public CommonResult login(@RequestBody User user){
        if (userService.userLogin(user.getEmail(), user.getPassword()) != null)
            return new CommonResult(200, "登陆成功", user.getUsername());
        else
            return new CommonResult(401, "用户名或密码错误", null);
    }

}
