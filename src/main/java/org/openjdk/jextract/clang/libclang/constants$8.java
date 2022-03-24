/*
 *  Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
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
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor clang_getEnumDeclIntegerType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("kind"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
    ),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getEnumDeclIntegerType$MH = RuntimeHelper.downcallHandle(
        "clang_getEnumDeclIntegerType",
        constants$8.clang_getEnumDeclIntegerType$FUNC, false
    );
    static final FunctionDescriptor clang_getEnumConstantDeclValue$FUNC = FunctionDescriptor.of(JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getEnumConstantDeclValue$MH = RuntimeHelper.downcallHandle(
        "clang_getEnumConstantDeclValue",
        constants$8.clang_getEnumConstantDeclValue$FUNC, false
    );
    static final FunctionDescriptor clang_getEnumConstantDeclUnsignedValue$FUNC = FunctionDescriptor.of(JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getEnumConstantDeclUnsignedValue$MH = RuntimeHelper.downcallHandle(
        "clang_getEnumConstantDeclUnsignedValue",
        constants$8.clang_getEnumConstantDeclUnsignedValue$FUNC, false
    );
    static final FunctionDescriptor clang_getFieldDeclBitWidth$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getFieldDeclBitWidth$MH = RuntimeHelper.downcallHandle(
        "clang_getFieldDeclBitWidth",
        constants$8.clang_getFieldDeclBitWidth$FUNC, false
    );
    static final FunctionDescriptor clang_Cursor_getNumArguments$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_Cursor_getNumArguments$MH = RuntimeHelper.downcallHandle(
        "clang_Cursor_getNumArguments",
        constants$8.clang_Cursor_getNumArguments$FUNC, false
    );
    static final FunctionDescriptor clang_Cursor_getArgument$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("kind"),
        JAVA_INT.withName("xdata"),
        MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
    ),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        ),
        JAVA_INT
    );
    static final MethodHandle clang_Cursor_getArgument$MH = RuntimeHelper.downcallHandle(
        "clang_Cursor_getArgument",
        constants$8.clang_Cursor_getArgument$FUNC, false
    );
}

