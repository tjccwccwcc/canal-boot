package cn.wolfcode.handler;

import cn.wolfcode.domain.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@Slf4j
@Component
@CanalTable(value = "t_order_info")
public class OrderaInfoHandler implements EntryHandler<OrderInfo> {
    @Override
    public void insert( OrderInfo orderInfo) {
        log.info("当有数据插入的时候会触发这个方法");
        log.info("插入的对象:" + orderInfo);
    }

    @Override
    public void update(OrderInfo before, OrderInfo after) {
        log.info("当有数据更新的时候会触发这个方法");
        log.info("before:" + before);
        log.info("after:" + after);
    }

    @Override
    public void delete(OrderInfo orderInfo) {
        log.info("当有数据删除的时候会触发这个方法");
        log.info("删除的对象:" + orderInfo);
    }
}
