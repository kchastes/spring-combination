/*
 * Copyright 2021-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package chaste.core.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author KChaste Sun
 */
@Component
public class PropertiesValue {

    private String name;
    public PropertiesValue(@Value("${aa.name}") String name){
        this.name = name;
    }
    @PostConstruct
    public void populateMovieCache() {
        System.out.println("init");
    }

    @PreDestroy
    public void clearMovieCache() {
        System.out.println("destroy");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PropertiesValue{" +
                "name='" + name + '\'' +
                '}';
    }
}
