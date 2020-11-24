package imu.hzm.ganasd.controller;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import org.apache.dubbo.config.annotation.Reference;

@RestController
@Api(value = "用户操作")
public class UserController {

    @Reference
    UserService userService;

    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @PostMapping(value = "/login")
    @ApiOperation(value = "普通用户登陆")
    public CommonResult login(@RequestBody User user){
        CommonResult commonResult = userService.userLogin(user.getEmail(), user.getPassword());
        return commonResult;
    }

    @PostMapping(value = "/register")
    @ApiOperation(value = "普通用户注册")
    public CommonResult register(@RequestBody User user){
        CommonResult commonResult = userService.userRegister(user);
        return commonResult;
    }

    @PutMapping(value = "/home/users")
    @ApiOperation(value = "修改用户属性")
    public CommonResult modifyUser(@RequestBody User user){
        CommonResult commonResult = userService.userModUsername(user);
        return commonResult;
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "Welcome!";
    }
}
