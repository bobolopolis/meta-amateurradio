LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=00f62fee8056dc37ed6566f4ab3ddf2a"

SRC_URI = "git://github.com/openzim/libzim.git;protocol=git;branch=master \
          "

# The tag for 7.1.0 
SRCREV = "c5caa51a2a0ff9b4aa0c0535d455b33b1da3c6c4"

S = "${WORKDIR}/git"

inherit meson
DEPENDS = "icu zstd xapian-core util-linux xz"
