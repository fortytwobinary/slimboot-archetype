/**
 * Copyright (c) David L Whitehurst.  All rights reserved.
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution
 * in the LICENSE file.
 *
 */

package ${package}.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PostRequest {

	@NotBlank
	@Size(min = 10)
	private String title;

	@NotBlank
	@Size(min = 50)
	private String body;

	@NotNull
	private Long categoryId;

	private List<String> tags;

	public List<String> getTags() {

		return tags == null ? Collections.emptyList() : new ArrayList<>(tags);
	}

	public void setTags(List<String> tags) {

		if (tags == null) {
			this.tags = null;
		} else {
			this.tags = Collections.unmodifiableList(tags);
		}
	}
}
