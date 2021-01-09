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

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.SmartLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author KChaste Sun
 */
public class LifecycleInitBean implements InitializingBean, DisposableBean, BeanNameAware {
    private SmartLifecycle smartLifecycle;
    public LifecycleInitBean(ApplicationContext applicationContext){
        System.out.println(applicationContext.getClass().getName());
        System.out.println("Constructor invoke...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet invoke...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy invoke....");
    }
    @PostConstruct
    public void initAnnotation(){
        System.out.println("Annotation init invoke.....");
    }
    @PreDestroy
    public void destroyAnnotation(){
        System.out.println("Annotation destroy invoke.....");
    }
    public void init(){
        System.out.println("init-method attribute invoke....");
    }
    public void clearUp(){
        System.out.println("destroy-method attribute invoke....");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    public SmartLifecycle getSmartLifecycle() {
        return smartLifecycle;
    }

    public void setSmartLifecycle(SmartLifecycle smartLifecycle) {
        System.out.println("set init...");
        this.smartLifecycle = smartLifecycle;
    }

    @Override
    public String toString() {
        return "toString...";
    }
}
