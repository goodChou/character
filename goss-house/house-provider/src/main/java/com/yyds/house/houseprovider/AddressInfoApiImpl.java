package com.yyds.house.houseprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.yyds.house.api.AddressInfoApi;

/**
 * <p>
 * <b>AddressInfoApiImpl</b>是地址服务相关业务。
 * </p>
 *
 * @author
 * @since 2021/8/20
 */
@Service
public class AddressInfoApiImpl implements AddressInfoApi {



  @Override
  public String getAddressInfoByNo(String qNo) {
    return "我是一段文字："+qNo;
  }
}
