package imu.hzm.ganasd.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BrandDao {

    public List<String> findAllBrand();

    public String findBrandNameById(@Param("brandId") Long brandId);

    public Long findBrandIdByName(@Param("brandName") String brandName);
}
