/*
 *  Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$18 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$18() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clang_getFunctionTypeCallingConv",
        constants$16.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clang_getResultType",
        constants$16.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clang_getNumArgTypes",
        constants$16.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("kind"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(2, RuntimeHelper.POINTER).withName("data")
    ).withName("CXType"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.sequenceLayout(2, RuntimeHelper.POINTER).withName("data")
        ).withName("CXType"),
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clang_getArgType",
        constants$18.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clang_isFunctionTypeVariadic",
        constants$16.const$2
    );
}


