LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9df08b19634b86f9db5ebbe1fd26ead3"

SRC_URI = "git://github.com/kainjow/Mustache.git;protocol=git;branch=master \
           file://0001-Update-catch2-library.patch \
          "

SRCREV = "c7b2c92b18ef3d6577a1110ac7ff31e3df8b5362"

inherit cmake

S = "${WORKDIR}/git"

ALLOW_EMPTY:${PN} = "1"

do_install() {
    install -D -m 0755 ${S}/mustache.hpp ${D}${includedir}/mustache.hpp
}

