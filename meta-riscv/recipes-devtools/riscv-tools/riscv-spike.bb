SUMMARY = "RISC-V Spike ISA Simulator"
DESCRIPTION = "RISC-V Spike ISA Simulator"
LICENSE = "GPLv2+"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRCREV = "a95b44df9d142a49f3e1bfe4a60d259ed41ca247"
SRC_URI = "git://github.com/riscv/riscv-isa-sim.git \
           file://spike-makefile.patch"

DEPENDS = "riscv-fesvr"
RDEPENDS_nativesdk-riscv-spike = "nativesdk-riscv-fesvr"

inherit autotools cross-canadian

BBCLASSEXTEND = "native nativesdk"

S = "${WORKDIR}/git"

do_configure_prepend () {
	touch ${S}/softfloat/softfloat.ac
        if [ ! -e ${S}/acinclude.m4 ]; then
                cp ${S}/aclocal.m4 ${S}/acinclude.m4
        fi
}
