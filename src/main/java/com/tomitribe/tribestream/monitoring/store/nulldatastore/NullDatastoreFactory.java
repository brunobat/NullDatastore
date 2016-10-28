/*
 * Tomitribe Confidential
 * Copyright Tomitribe Corporation. 2016
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.tribestream.monitoring.store.nulldatastore;

import com.tomitribe.tribestream.monitoring.store.DelegateDataStoreFactory;

import static com.tomitribe.tribestream.monitoring.util.Creator.autoSet;

/**
 * Created by bbaptist on 26/10/2016.
 */
public class NullDatastoreFactory extends DelegateDataStoreFactory {


    public NullDatastoreFactory() {
        super(
                autoSet(new NullCounterDatastore()),
                autoSet(new NullGaugesDatastore()),
                new NullPathTrackingDatastore(),
                autoSet(new NullHealthCheckDatastore()),
                autoSet(new NullEventDatastore())
        );
    }
}