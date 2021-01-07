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
package util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @KChaste Sun
 */
public class SpringUtil {

    public static ApplicationContext getApplicationContext(String... configLocations){
        // 该实例一创建会调用构造方法. 哪个配置文件写在前面,谁就先初始化.
        // 如果在Xml使用import导入,则可以不用写多个配置文件地址.
        return new ClassPathXmlApplicationContext(configLocations);
    }

}
