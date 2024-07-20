package com.example.dashboard.mapper;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.dto.response.UserResponse;
import com.example.dashboard.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    Customer toCustomer(UserCreationRequest request);

    UserResponse toUserResponse(Customer customer);

    @Mapping(target = "id", ignore = true)
    void updateCustomer(@MappingTarget Customer customer, UserUpdateRequest request );
}
