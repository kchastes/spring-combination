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
package chaste.core.lifecycle;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author KChaste Sun
 */
public class MyFactoryBean implements FactoryBean<String> {
    /**
     * 实际对象
     * @return 对象
     * @throws Exception 异常
     */
    @Override
    public String getObject() throws Exception {
        return null;
    }

    /**
     * 返回的对象的类型
     * @return Class
     */
    @Override
    public Class<?> getObjectType() {
        return String.class;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
