/**
 Copyright 2022 FortyTwoBinary and David L Whitehurst.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
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
