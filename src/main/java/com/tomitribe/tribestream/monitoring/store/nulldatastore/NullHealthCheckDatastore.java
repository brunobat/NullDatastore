/*
 * Tomitribe Confidential
 * Copyright Tomitribe Corporation. 2016
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.tribestream.monitoring.store.nulldatastore;

import com.tomitribe.tribestream.healthcheck.Health;
import com.tomitribe.tribestream.monitoring.store.healthcheck.HealthCheckDataStore;

/**
 * Created by bbaptist on 28/10/2016.
 */
public class NullHealthCheckDatastore implements HealthCheckDataStore {
    @Override
    public void healthcheckUpdated(final Health health) {
        // no-op
    }
}
