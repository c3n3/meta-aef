SUMMARY = "Pure-data"
SECTION = "audio"

SRC_URI = " \
    https://github.com/c3n3/audio-effects-framework/archive/refs/tags/v0.1.1.tar.gz \
"
SRC_URI[sha256sum] = "cade99888f5c3ef786e3e36b682fe249c52682e9319db71558e019fe8d23c55a"
LICENSE = "CLOSED"

DEPENDS += " python3-core"

inherit setuptools