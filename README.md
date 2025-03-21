# BeaconParsers

An Android library defining a variety of beacon parsers for use with the Android Beacon Library including:

* IBeaconParser
* EddystoneUidParser
* EddystoneUrlParser
* UrlBeaconParser

## Setup

1. Copy the beaconparsers.aar file into your project's libs folder

2. Make sure your libs folder is defined as a flatDir responsitory in your top-level build.gradle file:

```
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
```

3. Add the an import to your build.gradle file next to where you import the Android Beacon Library:

```
     implementation('com.davidgyoungtech:beacon-parsers:1.0')
     implementation('org.altbeacon:android-beacon-library:2+')
```

4. Access the beacon parsers in your source code like this:

```
import com.davidgyoungtech.beaconparsers.*

...
val region = BeaconRegion("wildcard iBeacon", IBeaconParser(), null, null, null)
val region2 = BeaconRegion("wildcard Eddystone UID", EddystoneUidParser(), null, null, null)
val region3 = BeaconRegion("wildcard iBeacon", EddystoneUrlParser(), null, null, null)

```


## License

Apache 2
