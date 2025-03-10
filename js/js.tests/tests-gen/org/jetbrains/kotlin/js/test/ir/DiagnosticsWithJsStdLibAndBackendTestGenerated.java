/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticsWithJsStdLibAndBackendTestGenerated extends AbstractDiagnosticsTestWithJsStdLibWithBackend {
    @Test
    public void testAllFilesPresentInTestsWithJsStdLibAndBackendCompilation() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation"), Pattern.compile("^([^_](.+))\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JS_IR, true);
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash")
    @TestDataPath("$PROJECT_ROOT")
    public class ExportedNamesClash {
        @Test
        public void testAllFilesPresentInExportedNamesClash() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash"), Pattern.compile("^([^_](.+))\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("functionAndFunction.kt")
        public void testFunctionAndFunction() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/functionAndFunction.kt");
        }

        @Test
        @TestMetadata("functionAndProperty.kt")
        public void testFunctionAndProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/functionAndProperty.kt");
        }

        @Test
        @TestMetadata("functionDifferentPackages.kt")
        public void testFunctionDifferentPackages() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/functionDifferentPackages.kt");
        }

        @Test
        @TestMetadata("multipleClash.kt")
        public void testMultipleClash() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/multipleClash.kt");
        }

        @Test
        @TestMetadata("multipleClashESModules.kt")
        public void testMultipleClashESModules() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/multipleClashESModules.kt");
        }

        @Test
        @TestMetadata("packageAndFunction.kt")
        public void testPackageAndFunction() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/packageAndFunction.kt");
        }

        @Test
        @TestMetadata("packageAndProperty.kt")
        public void testPackageAndProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/packageAndProperty.kt");
        }

        @Test
        @TestMetadata("propertyAndProperty.kt")
        public void testPropertyAndProperty() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/propertyAndProperty.kt");
        }

        @Test
        @TestMetadata("propertyDifferentPackages.kt")
        public void testPropertyDifferentPackages() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/exportedNamesClash/propertyDifferentPackages.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline")
    @TestDataPath("$PROJECT_ROOT")
    public class Inline {
        @Test
        public void testAllFilesPresentInInline() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline"), Pattern.compile("^([^_](.+))\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("recursionCycle.kt")
        public void testRecursionCycle() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycle.kt");
        }

        @Test
        @TestMetadata("recursionCycleLambda.kt")
        public void testRecursionCycleLambda() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleLambda.kt");
        }

        @Test
        @TestMetadata("recursionCycleWithPublicFun.kt")
        public void testRecursionCycleWithPublicFun() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithPublicFun.kt");
        }

        @Test
        @TestMetadata("recursionCycleWithStdlibCall.kt")
        public void testRecursionCycleWithStdlibCall() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithStdlibCall.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures")
    @TestDataPath("$PROJECT_ROOT")
    public class UnsupportedFeatures {
        @Test
        public void testAllFilesPresentInUnsupportedFeatures() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures"), Pattern.compile("^([^_](.+))\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JS_IR, true);
        }

        @Test
        @TestMetadata("annotations.kt")
        public void testAnnotations() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures/annotations.kt");
        }
    }
}
