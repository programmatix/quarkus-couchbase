/*
 * Copyright (c) 2021 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.quarkus.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.nativeimage.RuntimeInitializedClassBuildItem;

class CouchbaseQuarkusExtensionProcessor {
    private static final String FEATURE = "quarkus-couchbase";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    //    @BuildStep
    //    RuntimeInitializedClassBuildItem clusterEnvironment() {
    //        return new RuntimeInitializedClassBuildItem(ClusterEnvironment.class.getCanonicalName());
    //    }

    @BuildStep
    RuntimeInitializedClassBuildItem log4JLoggerFactory() {
        return new RuntimeInitializedClassBuildItem(
                "com.couchbase.client.core.deps.io.netty.util.internal.logging.Log4JLoggerFactory");
        //                com.couchbase.client.core.deps.io.netty.util.internal.logging.Log4JLoggerFactory.class.getCanonicalName());
    }

    @BuildStep
    RuntimeInitializedClassBuildItem internalLoggerFactory() {
        return new RuntimeInitializedClassBuildItem(
                com.couchbase.client.core.deps.io.netty.util.internal.logging.InternalLoggerFactory.class.getCanonicalName());
    }
}
