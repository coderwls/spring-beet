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
package org.spring.beet.demo.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CarController {

  @Value("${eureka.instance.instance-id}")
  String instanceId;

  @RequestMapping(path = "/hello")
  public String hello() {
    return "I'm Cars Service!";
  }

  @RequestMapping("/booking/{car}")
  public String booking(@PathVariable("car") int carNum) {
    log.info("Booking cars " + carNum + " success!");
    return "Booking cars " + carNum + " success! receive " + instanceId;
  }
}