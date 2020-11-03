package imu.hzm.ganasd.service;

import imu.hzm.ganasd.model.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {

    public List<String> findAllBrand();

    public String findBrandNameById(@Param("brandId") Long brandId);

    public Long findBrandIdByName(@Param("brandName") String brandName);
}
