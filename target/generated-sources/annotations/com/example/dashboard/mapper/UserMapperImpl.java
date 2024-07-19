package com.example.dashboard.mapper;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T22:38:38+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Customer toCustomer(UserCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( request.getId() );
        customer.setUsername( request.getUsername() );
        customer.setPassword( request.getPassword() );
        customer.setFirstName( request.getFirstName() );
        customer.setLastName( request.getLastName() );
        customer.setDob( request.getDob() );

        return customer;
    }

    @Override
    public void updateCustomer(Customer customer, UserUpdateRequest request) {
        if ( request == null ) {
            return;
        }
    }
}
