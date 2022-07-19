SUMMARY = "Pure-data"
SECTION = "audio"

SRC_URI = " \
    https://github.com/pure-data/pure-data/archive/refs/tags/${PV}.tar.gz \
"
SRC_URI[sha256sum] = "5f6f997c95e90f58f8fc88c744fdf6a6aac8a10affd2a95252933a08ee79b929"
LICENSE = "CLOSED"

DEPENDS += " autoconf m4 alsa-lib"

FILES_${PN} = "${libdir}/pd/ ${bindir}"

addtask do_setup before do_configure

addtask do_finalize after do_install

do_setup() {
    cd ${WORKDIR}/${BP}
    bberror "$(pwd)"
    bberror "${WORKDIR}/${BP}"
    bberror "$(ls ${WORKDIR}/${BP})"
    mkdir -p m4/generated
}

do_finalize() {
    install ${WORKDIR}/${BP}/build/bin/* ${D}${bindir}
}

inherit autotools gettext
