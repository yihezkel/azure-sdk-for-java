/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_10_31.DigitalTwinsEndpointResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.DigitalTwinsEndpointResourceProperties;
import org.joda.time.DateTime;
import rx.functions.Func1;

class DigitalTwinsEndpointResourceImpl extends CreatableUpdatableImpl<DigitalTwinsEndpointResource, DigitalTwinsEndpointResourceInner, DigitalTwinsEndpointResourceImpl> implements DigitalTwinsEndpointResource, DigitalTwinsEndpointResource.Definition, DigitalTwinsEndpointResource.Update {
    private final DigitalTwinsManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String endpointName;
    private DigitalTwinsEndpointResourceProperties cproperties;
    private DigitalTwinsEndpointResourceProperties uproperties;

    DigitalTwinsEndpointResourceImpl(String name, DigitalTwinsManager manager) {
        super(name, new DigitalTwinsEndpointResourceInner());
        this.manager = manager;
        // Set resource name
        this.endpointName = name;
        //
        this.cproperties = new DigitalTwinsEndpointResourceProperties();
        this.uproperties = new DigitalTwinsEndpointResourceProperties();
    }

    DigitalTwinsEndpointResourceImpl(DigitalTwinsEndpointResourceInner inner, DigitalTwinsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.endpointName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "digitalTwinsInstances");
        this.endpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "endpoints");
        //
        this.cproperties = new DigitalTwinsEndpointResourceProperties();
        this.uproperties = new DigitalTwinsEndpointResourceProperties();
    }

    @Override
    public DigitalTwinsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DigitalTwinsEndpointResource> createResourceAsync() {
        DigitalTwinsEndpointsInner client = this.manager().inner().digitalTwinsEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.endpointName, this.cproperties)
            .map(new Func1<DigitalTwinsEndpointResourceInner, DigitalTwinsEndpointResourceInner>() {
               @Override
               public DigitalTwinsEndpointResourceInner call(DigitalTwinsEndpointResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DigitalTwinsEndpointResource> updateResourceAsync() {
        DigitalTwinsEndpointsInner client = this.manager().inner().digitalTwinsEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.endpointName, this.uproperties)
            .map(new Func1<DigitalTwinsEndpointResourceInner, DigitalTwinsEndpointResourceInner>() {
               @Override
               public DigitalTwinsEndpointResourceInner call(DigitalTwinsEndpointResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DigitalTwinsEndpointResourceInner> getInnerAsync() {
        DigitalTwinsEndpointsInner client = this.manager().inner().digitalTwinsEndpoints();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.endpointName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new DigitalTwinsEndpointResourceProperties();
        this.uproperties = new DigitalTwinsEndpointResourceProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DigitalTwinsEndpointResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DigitalTwinsEndpointResourceImpl withExistingDigitalTwinsInstance(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    @Override
    public DigitalTwinsEndpointResourceImpl withProperties(DigitalTwinsEndpointResourceProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}