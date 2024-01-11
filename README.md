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
        flatDir {
            dirs 'libs'
        }
    }
}
```

3. Add the an import to your build.gradle file next to where you import the Android Beacon Library:

```
    implementation 'org.altbeacon:android-beacon-library:2.20.2'
    implementation 'com.davidgyoungtech:beaconparsers:1.0@aar'
```

4. Access the beacon parsers in your source code like this:

```
import com.davidgyoungtech.beaconparsers.*

...
beaconManager.getBeaconParsers().add(IBeaconParser())

```


## License

Apache 2
