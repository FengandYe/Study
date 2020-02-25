package io.lll.service;

import io.lll.dto.out.OrderHistoryListOutDTO;
import io.lll.dto.out.PageOutDTO;

public interface OrderHistoryService {

    public PageOutDTO<OrderHistoryListOutDTO> search(Byte order_status,
                                                     Boolean customer_notified,
                                                     Long time,
                                                     Integer pageNum);

    public OrderHistoryListOutDTO getById(Integer order_history_id);

    public OrderHistoryListOutDTO create(OrderHistoryListOutDTO orderHistoryListOutDTO);

    public OrderHistoryListOutDTO update(OrderHistoryListOutDTO orderHistoryListOutDTO);
}
