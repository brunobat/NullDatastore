/*
 * Tomitribe Confidential
 * Copyright Tomitribe Corporation. 2016
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.tribestream.monitoring.store.nulldatastore;

import com.tomitribe.tribestream.monitoring.pathtracking.PathCallInformation;
import com.tomitribe.tribestream.monitoring.pathtracking.PathTrackingEntry;
import com.tomitribe.tribestream.monitoring.store.tracking.AbstractPathTrackingDataStore;
import com.tomitribe.tribestream.monitoring.store.tracking.CollectorPathTrackingDataStore;
import com.tomitribe.tribestream.monitoring.store.tracking.PathTrackingDataStore;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

/**
 * Created by bbaptist on 28/10/2016.
 */
public class NullPathTrackingDatastore extends AbstractPathTrackingDataStore
        implements PathTrackingDataStore, CollectorPathTrackingDataStore {
    @Override
    public void store(PathTrackingEntry pathTrackingEntry) {
        //loose it
        return;
    }

    @Override
    public void store(Collection<PathTrackingEntry> pathTrackingEntries) {
        //loose it
        return;
    }

    @Override
    public void clearEntries() {
        return;
    }

    @Override
    public Collection<PathTrackingEntry> retrieve(String trackingId) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Collection<PathCallInformation> retrieveTrackingIds(Date startTime, Date endTime) {
        return Collections.EMPTY_LIST;
    }
}
