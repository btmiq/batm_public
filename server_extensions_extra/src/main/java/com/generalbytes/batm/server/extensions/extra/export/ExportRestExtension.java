/*************************************************************************************
 * Copyright (C) 2014-2020 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.export;

import com.generalbytes.batm.server.extensions.AbstractExtension;
import com.generalbytes.batm.server.extensions.IExtensionContext;
import com.generalbytes.batm.server.extensions.IRestService;
import com.google.common.collect.Sets;

import java.util.Set;

public class ExportRestExtension extends AbstractExtension {
    private static IExtensionContext ctx;

    @Override
    public String getName() {
        return "Export REST Extension for Data Ingestion to Third Party";
    }

    @Override
    public void init(IExtensionContext ctx) {
        super.init(ctx);
        this.ctx = ctx;
    }

    @Override
    public Set<IRestService> getRestServices() {
        return Sets.newHashSet(new IRestService() {
            @Override
            public String getPrefixPath() {
                return "export";
            }

            @Override
            public Class getImplementation() {
                return ExportRestService.class;
            }
        });
    }

    public static IExtensionContext getExtensionContext() {
        return ctx;
    }
}
