package com.duygu.employeeservice.core.mappers;

import com.duygu.employeeservice.core.dtos.contact.requests.CreateContactRequest;
import com.duygu.employeeservice.core.dtos.contact.requests.UpdateContactRequest;
import com.duygu.employeeservice.core.dtos.contact.responses.ContactResponse;
import com.duygu.employeeservice.core.dtos.contact.responses.GetAllContactResponse;
import com.duygu.employeeservice.core.dtos.contact.responses.GetByContactIdResponse;
import com.duygu.employeeservice.core.dtos.contact.responses.GetContactByEmployeeIdResponse;
import com.duygu.employeeservice.entities.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    ContactResponse createContactMapper(CreateContactRequest contactRequest);

    ContactResponse updateContactMapper(UpdateContactRequest contactRequest, @MappingTarget Contact contact);


    GetByContactIdResponse getByContactIdMapper(Contact contact);

    GetContactByEmployeeIdResponse getContactByEmployeeIdMapper(Contact contact);

    @Mapping(source = "id",target = "id")
    GetAllContactResponse getAllContactMapper(Contact contact);

    List<GetAllContactResponse> contactToListContactResponse(List<Contact> contacts);

}
