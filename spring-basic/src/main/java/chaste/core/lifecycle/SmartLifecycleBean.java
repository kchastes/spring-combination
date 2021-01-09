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

import org.springframework.context.SmartLifecycle;

/**
 * @author KChaste Sun
 */
public class SmartLifecycleBean implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("SmartLifecycle start");
    }

    @Override
    public void stop() {
        System.out.println("SmartLifecycle stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("SmartLifecycle running");
        return false;
    }
}
