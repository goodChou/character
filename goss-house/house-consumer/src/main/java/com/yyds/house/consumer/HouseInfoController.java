package com.yyds.house.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yyds.house.api.AddressInfoApi;
import com.yyds.house.api.HouseInfoApi;
import com.yyds.house.api.dto.House;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * <b>HouseInfoController</b>是房屋信息.
 * </p>
 *
 * @author
 * @since 2021/8/10
 */
@Controller
public class HouseInfoController {


  @Reference
  private HouseInfoApi houseInfoApi;

  @Reference
  private AddressInfoApi addressInfoApi;



  @RequestMapping("/qHouse")
  @ResponseBody
  public String sayHello(@RequestParam Integer houseNo) {
    return houseInfoApi.getHouse(houseNo);
  }

  @RequestMapping("/qAddress")
  @ResponseBody
  public String sayAddress(@RequestParam String qNo) {
    return addressInfoApi.getAddressInfoByNo(qNo);
  }

}
