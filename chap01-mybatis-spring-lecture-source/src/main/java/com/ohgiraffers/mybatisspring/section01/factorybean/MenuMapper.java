package com.ohgiraffers.mybatisspring.section01.factorybean;

import java.util.List;

public interface MenuMapper {
    List<MenuDTO> selectAllByOrderableStatus(String orderableStatus);
}
