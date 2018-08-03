package com.stylefeng.guns.modular.order.service;

import com.stylefeng.guns.core.node.ZTreeNode;
import com.stylefeng.guns.modular.system.model.Order;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 订单表
 服务类
 * </p>
 *
 * @author stylefeng
 * @since 2018-07-31
 */
public interface IOrderService extends IService<Order> {

	List<ZTreeNode> tree();

}
