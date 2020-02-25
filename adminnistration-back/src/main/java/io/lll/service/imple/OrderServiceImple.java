package io.lll.service.imple;


import io.lll.dto.out.OrderListOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImple implements OrderService {
    @Override
    public PageOutDTO<OrderListOutDTO> search(String customer_name, Byte status, Double total_price, Integer reword_points, Long create_time, Integer pageNum) {
        return null;
    }

    @Override
    public OrderListOutDTO getById(Integer order_id) {
        return null;
    }

    @Override
    public OrderListOutDTO getByCustomersId(Integer customers_id) {
        return null;
    }

    @Override
    public OrderListOutDTO create(OrderListOutDTO orderListOutDTO) {
        return null;
    }

    @Override
    public OrderListOutDTO update(OrderListOutDTO orderListOutDTO) {
        return null;
    }
}
