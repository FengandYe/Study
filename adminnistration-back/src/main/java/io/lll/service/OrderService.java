package io.lll.service;

import io.lll.dto.out.OrderListOutDTO;
import io.lll.dto.out.PageOutDTO;

public interface OrderService {

    public PageOutDTO<OrderListOutDTO> search(String customer_name,
                                              Byte status,
                                              Double total_price,
                                              Integer reword_points,
                                              Long create_time,
                                              Integer pageNum);

    public OrderListOutDTO getById(Integer order_id);

    public OrderListOutDTO getByCustomersId(Integer customers_id);

    public OrderListOutDTO create(OrderListOutDTO orderListOutDTO);

    public OrderListOutDTO update(OrderListOutDTO orderListOutDTO);
}
