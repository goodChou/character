package com.yyds.house.api.dto;

import java.io.Serializable;

/**
 * <p>
 * <b>House</b>是房屋实体类。
 * </p>
 *
 * @author
 * @since 2021/8/10
 */
public class House implements Serializable {

  public House(){}

  private Integer houseNo;

  private String name;

  private String addres;


  public Integer getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(Integer houseNo) {
    this.houseNo = houseNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddres() {
    return addres;
  }

  public void setAddres(String addres) {
    this.addres = addres;
  }
}
