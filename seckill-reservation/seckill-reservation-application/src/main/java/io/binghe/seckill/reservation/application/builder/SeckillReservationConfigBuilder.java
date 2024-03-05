/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.binghe.seckill.reservation.application.builder;

import io.binghe.seckill.common.builder.SeckillCommonBuilder;
import io.binghe.seckill.common.utils.beans.BeanUtil;
import io.binghe.seckill.reservation.application.command.SeckillReservationConfigCommand;
import io.binghe.seckill.reservation.domain.model.entity.SeckillReservationConfig;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description SeckillReservationConfigBuilder
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class SeckillReservationConfigBuilder extends SeckillCommonBuilder {

    public static SeckillReservationConfig toSeckillReservationConfig(SeckillReservationConfigCommand seckillReservationConfigCommand){
        if (seckillReservationConfigCommand == null || seckillReservationConfigCommand.isEmpty()){
            return null;
        }
        SeckillReservationConfig seckillReservationConfig = new SeckillReservationConfig();
        BeanUtil.copyProperties(seckillReservationConfigCommand, seckillReservationConfig);
        return seckillReservationConfig;
    }
}
