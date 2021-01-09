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
package lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import util.SpringUtil;

import java.util.Arrays;

/**
 * @author KChaste Sun
 */
public class SpringLifecycleTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringUtil.getApplicationContext("lifecycle/SpringLifecycle.xml");
        //LifecycleBean lifecycleBean = applicationContext.getBean("lifecycleBean", LifecycleBean.class);
        ConfigurableApplicationContext context = (ConfigurableApplicationContext) applicationContext;
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }

}
