package org.opendaylight.controller.config.yang.config.cup_provider.impl;

import org.opendaylight.controller.cup.provider.OpendaylightCup;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.CupService;

public class CupProviderModule extends org.opendaylight.controller.config.yang.config.cup_provider.impl.AbstractCupProviderModule {
    public CupProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public CupProviderModule(final org.opendaylight.controller.config.api.ModuleIdentifier identifier, 
    		final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, 
    		final CupProviderModule oldModule, final java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        final OpendaylightCup opendaylightCup = new OpendaylightCup();

        // Register to md-sal
        //opendaylightCup.setNotificationProvider(getNotificationServiceDependency());

        DataBroker dataBrokerService = getDataBrokerDependency();
        opendaylightCup.setDataProvider(dataBrokerService);
        

        final BindingAwareBroker.RpcRegistration<CupService> rpcRegistration = getRpcRegistryDependency()
                .addRpcImplementation(CupService.class, opendaylightCup);
        // Wrap cup as AutoCloseable and close registrations to md-sal at
        // close(). The close method is where you would generally clean up thread pools
        // etc.
        final class AutoCloseableCup implements AutoCloseable {

            @Override
            public void close() throws Exception {
                opendaylightCup.close();
                rpcRegistration.close();
            }
        }
        
        return new AutoCloseableCup();
    }

}