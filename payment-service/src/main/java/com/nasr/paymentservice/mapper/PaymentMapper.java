package com.nasr.paymentservice.mapper;

import com.nasr.paymentservice.base.mapper.BaseMapper;
import com.nasr.paymentservice.domain.Payment;
import com.nasr.paymentservice.dto.request.PaymentRequest;
import com.nasr.paymentservice.dto.response.PaymentResponse;
import org.mapstruct.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment, PaymentResponse, PaymentRequest> {
}
