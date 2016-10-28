/*
 * Tomitribe Confidential
 * Copyright Tomitribe Corporation. 2016
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.tomitribe.tribestream.monitoring.store.nulldatastore;

import com.tomitribe.tribestream.monitoring.counters.Counter;
import com.tomitribe.tribestream.monitoring.counters.DefaultCounter;
import com.tomitribe.tribestream.monitoring.store.counter.CounterDataStore;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by bbaptist on 28/10/2016.
 */
public class NullCounterDatastore implements CounterDataStore {
    @Override
    public Counter getOrCreateCounter(Counter.Key key) {
        return new DefaultCounter(key, this);
    }

    @Override
    public void clearCounters() {
        //nothing
        return;
    }

    @Override
    public Collection<Counter> getCounters() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void addToCounter(Counter defaultCounter, double delta) {
        //loose it
        return;
    }
}
