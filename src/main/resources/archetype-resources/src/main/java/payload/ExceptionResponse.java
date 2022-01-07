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

package ${package}.payload;

import lombok.Data;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class ExceptionResponse {
	private String error;
	private Integer status;
	private List<String> messages;
	private Instant timestamp;

	public ExceptionResponse(List<String> messages, String error, Integer status) {
		setMessages(messages);
		this.error = error;
		this.status = status;
		this.timestamp = Instant.now();
	}

	public List<String> getMessages() {

		return messages == null ? null : new ArrayList<>(messages);
	}

	public final void setMessages(List<String> messages) {

		if (messages == null) {
			this.messages = null;
		} else {
			this.messages = Collections.unmodifiableList(messages);
		}
	}

}
