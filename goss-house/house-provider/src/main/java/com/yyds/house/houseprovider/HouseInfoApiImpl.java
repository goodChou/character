package com.yyds.house.houseprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yyds.house.api.HouseInfoApi;
import com.yyds.house.api.dto.House;

/**
 * <p>
 * <b>HouseInfoApiImpl</b>是房屋信息业务实现。
 * </p>
 *
 * @author
 * @since 2021/8/10
 */
@Service
public class HouseInfoApiImpl implements HouseInfoApi {

  @Override
  public String getHouse(Integer houseNo) {
    House house = new House();
    house.setHouseNo(houseNo);
    house.setName("八号公馆");
    house.setAddres("中山路二十七号");
    ObjectMapper objectmapper = new ObjectMapper();
    String res = "";
    try {
      res = objectmapper.writeValueAsString(house);
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return res;

  }
}
