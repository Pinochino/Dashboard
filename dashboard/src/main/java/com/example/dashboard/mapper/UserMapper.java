package com.example.dashboard.mapper;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    Customer toCustomer(UserCreationRequest request);

    void updateCustomer(@MappingTarget Customer customer, UserUpdateRequest request );
}
