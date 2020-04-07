/*
 * Copyright (C) 2016 Thinkenterprise
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
 *
 *
 * @author Rafael Kansy
 * @author Michael Schaefer
 */

package com.thinkenterprise;


import com.thinkenterprise.service.RouteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Application {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(Application.class, args);
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 10000)
    public void changeStatus() {
        RouteService service = context.getBean(RouteService.class);
        service.setServiceStatus(!service.getServiceStatus());
    }
}
