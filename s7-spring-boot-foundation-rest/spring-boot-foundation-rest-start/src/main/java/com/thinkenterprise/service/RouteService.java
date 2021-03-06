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

package com.thinkenterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;


@Service
public class RouteService {
   
	@Autowired
    private RouteRepository routeRepository;

   
    public Iterable<Route> findAll() {
        return routeRepository.findAll();
    }

    public Iterable<Route> findByDeparture(String departure) {
        return routeRepository.findByDeparture(departure);
    }

   
    public void deleteById(long id) {
        routeRepository.deleteById(id);
    }

    public Route save(Route entity) {
        return routeRepository.save(entity);
    }

    public Route findById(long id) {
        return routeRepository.findById(id).get();
    }
}
