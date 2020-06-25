/**
 * Copyright © 2020 Lei Zhang (zhanglei@apache.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.spring.beet.common.exception;

/**
 * Dangerous operation Exception.
 */
public class DangerException extends Exception {

  public DangerException(final String errorMessage, final Throwable err) {
    super(errorMessage, err);
  }

  public DangerException(final String errorMessage) {
    super(errorMessage);
  }

  public DangerException() {
    super();
  }
}