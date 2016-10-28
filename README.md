# nullDatastore
Library to deliver a null implementation of EventDataStore. Events sent to it will be LOST FOREVER.

Configuration example:
```xml
<monitoring xmlns="http://www.tomitribe.com/schemas/2016/06/monitoring">
    <telemetry store="com.tomitribe.tribestream.monitoring.store.nulldatastore.NullEventDatastore" />
    <healthchecks store="com.tomitribe.tribestream.monitoring.store.nulldatastore.NullHealthCheckDatastore" />
    <counters store="com.tomitribe.tribestream.monitoring.store.nulldatastore.NullCounterDatastore" />
    <pathtracking store="com.tomitribe.tribestream.monitoring.store.nulldatastore.NullPathTrackingDatastore" />
    <gauges store="com.tomitribe.tribestream.monitoring.store.nulldatastore.NullGaugesDatastore" period="10000">
      <gauge class="com.tomitribe.tribestream.monitoring.gauges.sigar.SigarFilesystemGaugeFactory">
        <property name="skip" value="true" />
      </gauge>
    </gauges>
</monitoring>
```