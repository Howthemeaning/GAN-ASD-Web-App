package imu.hzm.ganasd.controller;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(value = "用户操作")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping(value = "/user/login")
    @ApiOperation(value = "普通用户登陆")
    @ResponseBody
    public CommonResult login(@RequestBody User user){
        if (userService.userLogin(user.getEmail(), user.getPassword()) != null)
            return new CommonResult(200, "登陆成功", user.getUsername());
        else
            return new CommonResult(401, "用户名或密码错误", null);
    }

    @PostMapping(value = "/user/register")
    @ApiOperation(value = "普通用户注册")
    @ResponseBody
    public CommonResult register(@RequestBody User user){
        if(!userService.userIsExist(user.getEmail())){
            user.setAuthorityId((long) 1);
            userService.userRegister(user);
            return new CommonResult(200, "注册成功", user.getUsername());
        }else {
            return new CommonResult(400, "当前用户已存在", null);
        }

    }

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Welcome!";
    }
}
