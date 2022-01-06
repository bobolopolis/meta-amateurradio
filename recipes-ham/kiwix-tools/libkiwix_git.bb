LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c61b8950dc1aab4d2aa7c2ae6b1cfb3"

SRC_URI = "git://github.com/kiwix/libkiwix.git;protocol=git;branch=master \
          "

SRCREV = "c9eb3196f76bdf79eb432a10a2c72de266011fe1"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "icu pugixml mustache curl libmicrohttpd zlib libzim xapian-core"

