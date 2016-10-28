/*
 * Tomitribe Confidential
 * Copyright Tomitribe Corporation. 2016
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.tribestream.monitoring.store.nulldatastore;

import com.tomitribe.tribestream.monitoring.events.Event;
import com.tomitribe.tribestream.monitoring.store.event.BatchEventDataStoreAdapter;

import java.util.Collection;
import java.util.Collections;

public class NullEventDatastore extends BatchEventDataStoreAdapter {

    @Override
    protected void pushEvents(final Collection<Event> eventList) {
        //loose them
        return;
    }

    public Collection<Event> getEvents() {
        return Collections.EMPTY_LIST;
    }

    public void clear() {
        return;
    }
}
