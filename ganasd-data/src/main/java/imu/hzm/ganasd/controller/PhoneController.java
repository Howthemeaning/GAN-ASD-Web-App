package imu.hzm.ganasd.controller;

import imu.hzm.ganasd.CommonResult;
import imu.hzm.ganasd.model.Phone;
import imu.hzm.ganasd.model.User;
import imu.hzm.ganasd.service.BrandService;
import imu.hzm.ganasd.service.PhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "手机相关")
public class PhoneController {

    @Resource
    PhoneService phoneService;

    @Resource
    BrandService brandService;

    @GetMapping("/user/updatePhone")
    @ApiOperation(value = "修改用户手机型号")
    @ResponseBody
    public CommonResult updateUserPhoneId(@RequestParam("userId") Long userId, @RequestParam("phoneName") String phoneName){
        Long phoneId = phoneService.findPhoneIdByName(phoneName);
        if (phoneId == null){
            return new CommonResult(410, "当前数据库没有该型号手机", null);
        }else {
            int result = phoneService.updateUserPhoneId(userId, phoneId);
            System.out.println(result);
            return new CommonResult(200, "修改成功", result);
        }
    }

    @GetMapping(value = "/user/findAllBrand")
    @ApiOperation(value = "查找所有手机品牌")
    @ResponseBody
    public CommonResult findAllBrand(){
        List<String> list = brandService.findAllBrand();
        return new CommonResult(200, "所有手机品牌", list);
    }

    @GetMapping(value = "/user/findAllPhone")
    @ApiOperation(value = "查找该品牌所有手机型号")
    @ResponseBody
    public CommonResult findAllPhone(@RequestParam("brandName") String brandName){
        Long brandId = brandService.findBrandIdByName(brandName);
        List<String> phoneName = phoneService.findAllPhone(brandId);
        for (String s: phoneName){
            System.out.println(s);
        }
        return new CommonResult(200, "该品牌手机所有手机型号", phoneName);
    }

    @PostMapping(value = "/user/findUserPhone")
    @ApiOperation(value = "查找用户手机信息")
    @ResponseBody
    public CommonResult retrieveUserPhone(@RequestParam("phoneId") Long phoneId){
        Phone phone = phoneService.findUserPhone(phoneId);
        if (phone == null){
            return new CommonResult(510, "您没有添加该手机信息", null);
        }
        else {
            String brandName = brandService.findBrandNameById(phone.getBrandId());
            Map<String, String> map = new HashMap();
            map.put("brandName", brandName);
            map.put("phoneName", phone.getPhoneName());
            return new CommonResult(200, "您的手机信息为", map);
        }
    }
}
