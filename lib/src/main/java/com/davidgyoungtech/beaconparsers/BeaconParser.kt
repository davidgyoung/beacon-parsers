package com.davidgyoungtech.beaconparsers

import org.altbeacon.beacon.BeaconParser

class IBeaconParser: BeaconParser("ibeacon") {
    val IBEACON_LAYOUT = "m:2-3=0215,i:4-19,i:20-21,i:22-23,p:24-24"
    init {
        this.setBeaconLayout(IBEACON_LAYOUT)
    }
}
class EddystoneUidBeaconParser: BeaconParser("eddystone_uid") {
    init {
        this.setBeaconLayout(BeaconParser.EDDYSTONE_UID_LAYOUT)
    }
}
class EddystoneUrlBeaconParser: BeaconParser("eddystone_url") {
    init {
        this.setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT)
    }
}
class EddystoneTlmBeaconParser: BeaconParser("eddystone_tlm") {
    init {
        this.setBeaconLayout(BeaconParser.EDDYSTONE_TLM_LAYOUT)
    }
}
class UriBeaconParser: BeaconParser("uri_beacon") {
    init {
        this.setBeaconLayout(BeaconParser.URI_BEACON_LAYOUT)
    }
}