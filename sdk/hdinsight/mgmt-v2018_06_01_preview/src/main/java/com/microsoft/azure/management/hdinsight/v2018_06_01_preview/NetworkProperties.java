/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network properties.
 */
public class NetworkProperties {
    /**
     * The direction for the resource provider connection. Possible values
     * include: 'Inbound', 'Outbound'.
     */
    @JsonProperty(value = "resourceProviderConnection")
    private ResourceProviderConnection resourceProviderConnection;

    /**
     * Indicates whether or not private link is enabled. Possible values
     * include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "privateLink")
    private PrivateLink privateLink;

    /**
     * Get the direction for the resource provider connection. Possible values include: 'Inbound', 'Outbound'.
     *
     * @return the resourceProviderConnection value
     */
    public ResourceProviderConnection resourceProviderConnection() {
        return this.resourceProviderConnection;
    }

    /**
     * Set the direction for the resource provider connection. Possible values include: 'Inbound', 'Outbound'.
     *
     * @param resourceProviderConnection the resourceProviderConnection value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withResourceProviderConnection(ResourceProviderConnection resourceProviderConnection) {
        this.resourceProviderConnection = resourceProviderConnection;
        return this;
    }

    /**
     * Get indicates whether or not private link is enabled. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the privateLink value
     */
    public PrivateLink privateLink() {
        return this.privateLink;
    }

    /**
     * Set indicates whether or not private link is enabled. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param privateLink the privateLink value to set
     * @return the NetworkProperties object itself.
     */
    public NetworkProperties withPrivateLink(PrivateLink privateLink) {
        this.privateLink = privateLink;
        return this;
    }

}