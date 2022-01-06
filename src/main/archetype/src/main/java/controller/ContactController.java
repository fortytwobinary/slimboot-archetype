/**
 * Copyright (c) David L Whitehurst.  All rights reserved.
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution
 * in the LICENSE file.
 *
 */

package ${package}.controller;

import com.dlwhitehurst.slimboot.payload.PagedResponse;
import com.dlwhitehurst.slimboot.model.Contact;
import com.dlwhitehurst.slimboot.service.ContactService;
import com.dlwhitehurst.slimboot.utils.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public ResponseEntity<PagedResponse<Contact>> getContacts(
            @RequestParam(value = "page", required = false, defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = AppConstants.DEFAULT_PAGE_SIZE) Integer size) {

        PagedResponse<Contact> response = contactService.getAllContacts(page, size);

        return new ResponseEntity< >(response, HttpStatus.OK);
    }

}
