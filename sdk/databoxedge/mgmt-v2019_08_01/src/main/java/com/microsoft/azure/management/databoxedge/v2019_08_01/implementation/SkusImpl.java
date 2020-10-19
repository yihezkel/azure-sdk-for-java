/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2019_08_01.Skus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ResourceTypeSku;

class SkusImpl extends WrapperImpl<SkusInner> implements Skus {
    private PagedListConverter<ResourceTypeSkuInner, ResourceTypeSku> converter;
    private final DataBoxEdgeManager manager;

    SkusImpl(DataBoxEdgeManager manager) {
        super(manager.inner().skus());
        this.manager = manager;
        this.converter = new PagedListConverter<ResourceTypeSkuInner, ResourceTypeSku>() {
            @Override
            public Observable<ResourceTypeSku> typeConvertAsync(ResourceTypeSkuInner inner) {
                return Observable.just((ResourceTypeSku) wrapModel(inner));
            }
        };
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    private ResourceTypeSkuImpl wrapModel(ResourceTypeSkuInner inner) {
        return  new ResourceTypeSkuImpl(inner, manager());
    }

    @Override
    public PagedList<ResourceTypeSku> list() {
        SkusInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<ResourceTypeSku> listAsync() {
        SkusInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ResourceTypeSkuInner>, Observable<ResourceTypeSkuInner>>() {
            @Override
            public Observable<ResourceTypeSkuInner> call(Page<ResourceTypeSkuInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ResourceTypeSkuInner, ResourceTypeSku>() {
            @Override
            public ResourceTypeSku call(ResourceTypeSkuInner inner) {
                return wrapModel(inner);
            }
        });
    }

}