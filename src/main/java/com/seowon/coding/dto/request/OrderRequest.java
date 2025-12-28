package com.seowon.coding.dto.request;

import com.seowon.coding.service.OrderProduct;
import java.util.List;

public record OrderRequest(
    String customerName,
    String customerEmail,
    List<OrderProduct> products
) {
}
