package imu.hzm.ganasd.service.impl;

import imu.hzm.ganasd.dao.BrandDao;
import imu.hzm.ganasd.model.Brand;
import imu.hzm.ganasd.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    BrandDao brandDao;

    @Override
    public List<String> findAllBrand() {
        return brandDao.findAllBrand();
    }

    @Override
    public String findBrandNameById(Long brandId) {
        return brandDao.findBrandNameById(brandId);
    }

    @Override
    public Long findBrandIdByName(String brandName) {
        return brandDao.findBrandIdByName(brandName);
    }
}
