/*
 * Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package org.openjdk.jextract.test.toolprovider;

import java.nio.file.Path;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySegment;
import testlib.TestUtils;
import org.testng.annotations.Test;
import testlib.JextractToolRunner;

public class Test8260717 extends JextractToolRunner {
    @Test
    public void test() {
        Path outputPath = getOutputFilePath("output");
        Path headerFile = getInputFilePath("test8260717.h");
        run("--output", outputPath.toString(), headerFile.toString()).checkSuccess();
        try(TestUtils.Loader loader = TestUtils.classLoader(outputPath)) {
            Class<?> FooClass = loader.loadClass("foo_t");
            checkMethod(FooClass, "s$get", short.class, MemorySegment.class);
            checkMethod(FooClass, "s$get", short.class, MemorySegment.class, long.class);
            checkMethod(FooClass, "s$set", void.class, MemorySegment.class, short.class);
            checkMethod(FooClass, "s$set", void.class, MemorySegment.class, long.class, short.class);

            checkMethod(FooClass, "ptr$get", MemorySegment.class, MemorySegment.class);
            checkMethod(FooClass, "ptr$get", MemorySegment.class, MemorySegment.class, long.class);
            checkMethod(FooClass, "ptr$set", void.class, MemorySegment.class, MemorySegment.class);
            checkMethod(FooClass, "ptr$set", void.class, MemorySegment.class, long.class, MemorySegment.class);

        } finally {
            TestUtils.deleteDir(outputPath);
        }
    }
}
