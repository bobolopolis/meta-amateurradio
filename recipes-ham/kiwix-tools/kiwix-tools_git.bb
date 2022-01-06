LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "git://github.com/kiwix/kiwix-tools.git;protocol=git;branch=master \
          "

SRCREV = "9b158360a638aff9ceace63fd1534c05bd260823"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "zlib libkiwix"
