/**
 * Copyright (c) David L Whitehurst.  All rights reserved.
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution
 * in the LICENSE file.
 *
 */

package ${package}.payload;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PagedResponse<T> {
	private List<T> content;
	private int page;
	private int size;
	private long totalElements;
	private int totalPages;
	private boolean last;

	public PagedResponse() {

	}

	public PagedResponse(List<T> content, int page, int size, long totalElements, int totalPages, boolean last) {
		setContent(content);
		this.page = page;
		this.size = size;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}

	public List<T> getContent() {
		return content == null ? null : new ArrayList<>(content);
	}

	public final void setContent(List<T> content) {
		if (content == null) {
			this.content = null;
		} else {
			this.content = Collections.unmodifiableList(content);
		}
	}



	public boolean isLast() {
		return last;
	}
}
