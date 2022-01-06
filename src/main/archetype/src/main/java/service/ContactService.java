/**
 * Copyright (c) David L Whitehurst.  All rights reserved.
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution
 * in the LICENSE file.
 *
 */

package ${package}.service;

import com.dlwhitehurst.slimboot.payload.PagedResponse;
import com.dlwhitehurst.slimboot.model.Contact;

public interface ContactService {

    PagedResponse<Contact> getAllContacts(int page, int size);

    Contact addContact(Contact todo);

    Contact getContact(Long id);

    Contact updateContact(Long id, Contact newTodo);

    //ApiResponse deleteContact(Long id);

}
