package com.example.dashboard.mapper;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.dto.response.UserResponse;
import com.example.dashboard.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-24T21:53:25+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Customer toCustomer(UserCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setUsername( request.getUsername() );
        customer.setPassword( request.getPassword() );
        customer.setFirstName( request.getFirstName() );
        customer.setLastName( request.getLastName() );
        customer.setDob( request.getDob() );

        return customer;
    }

    @Override
    public UserResponse toUserResponse(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( customer.getId() );
        userResponse.username( customer.getUsername() );
        userResponse.password( customer.getPassword() );
        userResponse.firstName( customer.getFirstName() );
        userResponse.lastName( customer.getLastName() );
        userResponse.dob( customer.getDob() );

        return userResponse.build();
    }

    @Override
    public void updateCustomer(Customer customer, UserUpdateRequest request) {
        if ( request == null ) {
            return;
        }

        customer.setUsername( request.getUsername() );
        customer.setPassword( request.getPassword() );
        customer.setFirstName( request.getFirstName() );
        customer.setLastName( request.getLastName() );
        customer.setDob( request.getDob() );
    }
}
