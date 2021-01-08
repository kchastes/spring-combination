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
package chaste.core.simple;

import chaste.core.simple.abs.Color;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *
 * @author KChaste Sun
 */
public class BlackColor extends Color {

    private static final BlackColor BLACK_COLOR = new BlackColor();

    public BlackColor(){
        super("black");
        System.out.println("Black color init");
    }

    public static BlackColor getInstance(){
        System.out.println("Static method");
        return BLACK_COLOR;
    }

    @Override
    public String toString() {
        return "BlackColor{}";
    }
}
