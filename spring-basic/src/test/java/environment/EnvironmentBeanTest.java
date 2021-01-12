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
package environment;

import chaste.core.environment.EnvironmentBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author KChaste Sun
 */
public class EnvironmentBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev","test");

        applicationContext.register(EnvironmentBeanConfig.class);
        applicationContext.refresh();

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        Object animal = applicationContext.getBean("animal");
        System.out.println("animal = " + animal);

        // 添加自定义PropertySource
        /*
        ConfigurableApplicationContext ctx = new GenericApplicationContext();
        MutablePropertySources sources = ctx.getEnvironment().getPropertySources();
        sources.addFirst(new MyPropertySource());
        */

    }

}
