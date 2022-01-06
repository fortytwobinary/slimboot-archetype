/**
 * Copyright (c) David L Whitehurst.  All rights reserved.
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution
 * in the LICENSE file.
 *
 */

package ${package}.service.impl;

import ${package}.payload.PagedResponse;
import ${package}.repository.ContactRepository;
import ${package}.utils.AppConstants;
import ${package}.model.Contact;
import ${package}.service.ContactService;
import ${package}.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;


    @Override
    public PagedResponse<Contact> getAllContacts(int page, int size) {
        AppUtils.validatePageNumberAndSize(page, size);
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, AppConstants.ID);

        Page<Contact> contacts = contactRepository.findAll(pageable);

        List<Contact> content = contacts.getNumberOfElements() == 0 ? Collections.emptyList() : contacts.getContent();

        return new PagedResponse<>(content, contacts.getNumber(), contacts.getSize(), contacts.getTotalElements(),
                contacts.getTotalPages(), contacts.isLast());
    }

    @Override
    public Contact addContact(Contact todo) {
        return null;
    }

    @Override
    public Contact getContact(Long id) {
        return null;
    }

    @Override
    public Contact updateContact(Long id, Contact newTodo) {
        return null;
    }

//    @Override
//    public ApiResponse deleteContact(Long id) {
//        return null;
//    }
}
