/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.StorageAccountInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.DataBoxEdgeManager;

/**
 * Type representing StorageAccount.
 */
public interface StorageAccount extends HasInner<StorageAccountInner>, Indexable, Refreshable<StorageAccount>, Updatable<StorageAccount.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the blobEndpoint value.
     */
    String blobEndpoint();

    /**
     * @return the containerCount value.
     */
    Integer containerCount();

    /**
     * @return the dataPolicy value.
     */
    DataPolicy dataPolicy();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the storageAccountCredentialId value.
     */
    String storageAccountCredentialId();

    /**
     * @return the storageAccountStatus value.
     */
    StorageAccountStatus storageAccountStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StorageAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccount definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the storageaccount definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName The device name
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithCreate withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the storageaccount definition allowing to specify DataPolicy.
         */
        interface WithDataPolicy {
            /**
             * Specifies dataPolicy.
             * @param dataPolicy Data policy of the storage Account. Possible values include: 'Cloud', 'Local'
             * @return the next definition stage
             */
            WithCreate withDataPolicy(DataPolicy dataPolicy);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description for the storage Account
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the storageaccount definition allowing to specify StorageAccountCredentialId.
         */
        interface WithStorageAccountCredentialId {
            /**
             * Specifies storageAccountCredentialId.
             * @param storageAccountCredentialId Storage Account Credential Id
             * @return the next definition stage
             */
            WithCreate withStorageAccountCredentialId(String storageAccountCredentialId);
        }

        /**
         * The stage of the storageaccount definition allowing to specify StorageAccountStatus.
         */
        interface WithStorageAccountStatus {
            /**
             * Specifies storageAccountStatus.
             * @param storageAccountStatus Current status of the storage account. Possible values include: 'OK', 'Offline', 'Unknown', 'Updating', 'NeedsAttention'
             * @return the next definition stage
             */
            WithCreate withStorageAccountStatus(StorageAccountStatus storageAccountStatus);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccount>, DefinitionStages.WithDataPolicy, DefinitionStages.WithDescription, DefinitionStages.WithStorageAccountCredentialId, DefinitionStages.WithStorageAccountStatus {
        }
    }
    /**
     * The template for a StorageAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccount>, UpdateStages.WithDataPolicy, UpdateStages.WithDescription, UpdateStages.WithStorageAccountCredentialId, UpdateStages.WithStorageAccountStatus {
    }

    /**
     * Grouping of StorageAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccount update allowing to specify DataPolicy.
         */
        interface WithDataPolicy {
            /**
             * Specifies dataPolicy.
             * @param dataPolicy Data policy of the storage Account. Possible values include: 'Cloud', 'Local'
             * @return the next update stage
             */
            Update withDataPolicy(DataPolicy dataPolicy);
        }

        /**
         * The stage of the storageaccount update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description for the storage Account
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the storageaccount update allowing to specify StorageAccountCredentialId.
         */
        interface WithStorageAccountCredentialId {
            /**
             * Specifies storageAccountCredentialId.
             * @param storageAccountCredentialId Storage Account Credential Id
             * @return the next update stage
             */
            Update withStorageAccountCredentialId(String storageAccountCredentialId);
        }

        /**
         * The stage of the storageaccount update allowing to specify StorageAccountStatus.
         */
        interface WithStorageAccountStatus {
            /**
             * Specifies storageAccountStatus.
             * @param storageAccountStatus Current status of the storage account. Possible values include: 'OK', 'Offline', 'Unknown', 'Updating', 'NeedsAttention'
             * @return the next update stage
             */
            Update withStorageAccountStatus(StorageAccountStatus storageAccountStatus);
        }

    }
}