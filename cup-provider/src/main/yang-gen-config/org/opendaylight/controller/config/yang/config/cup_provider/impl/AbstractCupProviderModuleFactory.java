/*
* Generated file
*
* Generated from: yang module name: cup-provider-impl yang module local name: cup-provider-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Thu Sep 25 10:15:53 EDT 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.cup_provider.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-11-16", name = "cup-provider-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:config:cup-provider:impl")

public abstract class AbstractCupProviderModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "cup-provider-impl";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs2 = new java.util.HashSet<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>>();
        serviceIfcs = java.util.Collections.unmodifiableSet(serviceIfcs2);
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule oldModule = null;
        try {
            oldModule = (org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setDataBroker(oldModule.getDataBroker());

        return module;
    }

    public org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<org.opendaylight.controller.config.yang.config.cup_provider.impl.CupProviderModule>();
    }

}
