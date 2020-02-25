package io.lll.service.imple;

import io.lll.dto.out.OrderHistoryListOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.OrderHistoryService;
import org.springframework.stereotype.Service;

@Service
public class OrderHistoryServiceImple implements OrderHistoryService {
    @Override
    public PageOutDTO<OrderHistoryListOutDTO> search(Byte order_status, Boolean customer_notified, Long time, Integer pageNum) {
        return null;
    }

    @Override
    public OrderHistoryListOutDTO getById(Integer order_history_id) {
        return null;
    }

    @Override
    public OrderHistoryListOutDTO create(OrderHistoryListOutDTO orderHistoryListOutDTO) {
        return null;
    }

    @Override
    public OrderHistoryListOutDTO update(OrderHistoryListOutDTO orderHistoryListOutDTO) {
        return null;
    }
}
