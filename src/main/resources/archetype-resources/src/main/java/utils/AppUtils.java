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

package ${package}.utils;

import ${package}.exception.ApiException;
import org.springframework.http.HttpStatus;

public class AppUtils {
	public static void validatePageNumberAndSize(int page, int size) {
		if (page < 0) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Page number cannot be less than zero.");
		}

		if (size < 0) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Size number cannot be less than zero.");
		}

		if (size > AppConstants.MAX_PAGE_SIZE) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Page size must not be greater than " + AppConstants.MAX_PAGE_SIZE);
		}
	}
}
