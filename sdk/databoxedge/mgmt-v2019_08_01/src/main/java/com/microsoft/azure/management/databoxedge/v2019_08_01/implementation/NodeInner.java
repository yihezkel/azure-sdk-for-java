/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.NodeStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ARMBaseModel;

/**
 * Represents a single node in a Data box Edge/Gateway device
 * Gateway devices, standalone Edge devices and a single node cluster Edge
 * device will all have 1 node
 * Multi-node Edge devices will have more than 1 nodes.
 */
@JsonFlatten
public class NodeInner extends ARMBaseModel {
    /**
     * The current status of the individual node. Possible values include:
     * 'Unknown', 'Up', 'Down', 'Rebooting', 'ShuttingDown'.
     */
    @JsonProperty(value = "properties.nodeStatus", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStatus nodeStatus;

    /**
     * Serial number of the Chassis.
     */
    @JsonProperty(value = "properties.nodeChassisSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeChassisSerialNumber;

    /**
     * Serial number of the individual node.
     */
    @JsonProperty(value = "properties.nodeSerialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeSerialNumber;

    /**
     * Display Name of the individual node.
     */
    @JsonProperty(value = "properties.nodeDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeDisplayName;

    /**
     * Friendly software version name that is currently installed on the node.
     */
    @JsonProperty(value = "properties.nodeFriendlySoftwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeFriendlySoftwareVersion;

    /**
     * HCS version that is currently installed on the node.
     */
    @JsonProperty(value = "properties.nodeHcsVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeHcsVersion;

    /**
     * Guid instance id of the node.
     */
    @JsonProperty(value = "properties.nodeInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeInstanceId;

    /**
     * Get the current status of the individual node. Possible values include: 'Unknown', 'Up', 'Down', 'Rebooting', 'ShuttingDown'.
     *
     * @return the nodeStatus value
     */
    public NodeStatus nodeStatus() {
        return this.nodeStatus;
    }

    /**
     * Get serial number of the Chassis.
     *
     * @return the nodeChassisSerialNumber value
     */
    public String nodeChassisSerialNumber() {
        return this.nodeChassisSerialNumber;
    }

    /**
     * Get serial number of the individual node.
     *
     * @return the nodeSerialNumber value
     */
    public String nodeSerialNumber() {
        return this.nodeSerialNumber;
    }

    /**
     * Get display Name of the individual node.
     *
     * @return the nodeDisplayName value
     */
    public String nodeDisplayName() {
        return this.nodeDisplayName;
    }

    /**
     * Get friendly software version name that is currently installed on the node.
     *
     * @return the nodeFriendlySoftwareVersion value
     */
    public String nodeFriendlySoftwareVersion() {
        return this.nodeFriendlySoftwareVersion;
    }

    /**
     * Get hCS version that is currently installed on the node.
     *
     * @return the nodeHcsVersion value
     */
    public String nodeHcsVersion() {
        return this.nodeHcsVersion;
    }

    /**
     * Get guid instance id of the node.
     *
     * @return the nodeInstanceId value
     */
    public String nodeInstanceId() {
        return this.nodeInstanceId;
    }

}