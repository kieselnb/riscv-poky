PV = "7.2.0"
BINV = "7.2.0"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://riscv-legitimize-move.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://riscv-strict-align.patch"
