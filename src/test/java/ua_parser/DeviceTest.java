/**
 * Copyright 2012 Twitter, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ua_parser;

/**
 * @author Steve Jiang (@sjiang) <gh at iamsteve com>
 */
public class DeviceTest extends DataTest<Device> {
  @Override
  protected Device getRandomInstance(long seed, StringGenerator g) {
    random.setSeed(seed);
    String family = g.getString(256),
            brand = (random.nextBoolean() ? g.getString(8): null),
            model = (random.nextBoolean() ? g.getString(8): null);
    return new Device(family,brand,model);
  }

  @Override
  protected Device getBlankInstance() {
    return new Device(null,null,null);
  }
}