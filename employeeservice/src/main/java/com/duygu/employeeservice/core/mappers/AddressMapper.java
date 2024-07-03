package com.duygu.employeeservice.core.mappers;

import com.duygu.employeeservice.core.dtos.address.requests.CreateAddressRequest;
import com.duygu.employeeservice.core.dtos.address.requests.UpdateAddressRequest;
import com.duygu.employeeservice.core.dtos.address.responses.GetAddressByEmployeeIdResponse;
import com.duygu.employeeservice.core.dtos.address.responses.GetAllAddressResponse;
import com.duygu.employeeservice.core.dtos.address.responses.GetByAddressIdResponse;
import com.duygu.employeeservice.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
    Address createAddressMapper(CreateAddressRequest addressRequest);

    Address updateAddressMapper(UpdateAddressRequest addressRequest, @MappingTarget Address address);


    GetByAddressIdResponse getByAddressIdMapper(Address address);

    @Mapping(target =  "employeeId", source = "employee.id")
    GetAddressByEmployeeIdResponse getAddressByCustomerIdMapper(Address address);

    @Mapping(source = "id",target = "id")
    GetAllAddressResponse getAllAddressMapper(Address address);
    List<GetAllAddressResponse> addressToListAddressResponse(List<Address> addresses);


}
