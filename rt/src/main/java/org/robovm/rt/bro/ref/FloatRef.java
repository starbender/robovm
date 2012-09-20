/*
 * Copyright (C) 2012 RoboVM
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
 */
package org.robovm.rt.bro.ref;

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * Used to map a <code>float *</code>.
 */
public final class FloatRef extends Struct<FloatRef> {
    /**
     * Creates a new {@link FloatRef} with a value of 0.0f.
     */
    public FloatRef() {
    }
    
    /**
     * Creates a new {@link FloatRef} and initializes it with the specified value.
     * 
     * @param value the value.
     */
    public FloatRef(float value) {
        setValue(value);
    }

    @StructMember
    private native float getValue();
    @StructMember
    private native void setValue(float value);
    
    /**
     * Returns the current value.
     * 
     * @return the value.
     */
    public float get() {
        return getValue();
    }
    
    /**
     * Sets the value.
     * 
     * @param value the new value.
     */
    public void set(float value) {
        setValue(value);
    }
}
