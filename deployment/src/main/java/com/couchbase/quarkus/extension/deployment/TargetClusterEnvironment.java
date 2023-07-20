//package com.couchbase.quarkus.extension.deployment;
//
//import java.util.function.BooleanSupplier;
//
////
////@TargetClass(ClusterEnvironment.class)
////@Substitute
////public final class TargetClusterEnvironment {
////    private JsonSerializer newDefaultSerializer(CryptoManager cryptoManager) {
////        System.out.println("Custom newDefaultSerializer 2");
////        return DefaultJsonSerializer.create(cryptoManager);
////    }
////}
//import com.couchbase.client.core.encryption.CryptoManager;
//import com.couchbase.client.java.codec.DefaultJsonSerializer;
//import com.couchbase.client.java.codec.JsonSerializer;
//import com.couchbase.client.java.env.ClusterEnvironment;
//import com.oracle.svm.core.annotate.Substitute;
//import com.oracle.svm.core.annotate.TargetClass;
//
//@TargetClass(value = ClusterEnvironment.class, onlyWith = TargetClusterEnvironment.IsJacksonAbsent.class)
//public final class TargetClusterEnvironment {
//    @Substitute
//    private JsonSerializer newDefaultSerializer(CryptoManager cryptoManager) {
//        return DefaultJsonSerializer.create(cryptoManager);
//    }
//
//    public static class IsJacksonAbsent implements BooleanSupplier {
//
//        @Override
//        public boolean getAsBoolean() {
//            try {
//                Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
//                return false;
//            } catch (ClassNotFoundException ignored) {
//                return true;
//            }
//        }
//    }
//}
