//package com.couchbase.quarkus.extension.deployment;
//
//import com.couchbase.client.core.deps.io.netty.util.internal.logging.InternalLoggerFactory;
//import com.couchbase.client.core.deps.io.netty.util.internal.logging.JdkLoggerFactory;
//import com.oracle.svm.core.annotate.Substitute;
//import com.oracle.svm.core.annotate.TargetClass;
//
//@TargetClass(value = InternalLoggerFactory.class)
//public final class TargetInternalLoggerFactory {
//    @Substitute
//    private static InternalLoggerFactory newDefaultFactory(String name) {
//        return JdkLoggerFactory.INSTANCE;
//    }
//}
//
//@TargetClass(className = "com.couchbase.client.core.deps.io.netty.util.internal.logging.InternalLoggerFactory")
//final class Target_io_netty_util_internal_logging_InternalLoggerFactory {
//
//    @Substitute
//    private static InternalLoggerFactory newDefaultFactory(String name) {
//        return JdkLoggerFactory.INSTANCE;
//    }
//}