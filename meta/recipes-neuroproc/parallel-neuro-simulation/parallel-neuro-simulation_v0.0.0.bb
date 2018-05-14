SUMMARY = " Parallel Neuron Simulation - neuron simulation program"
DESCRIPTION = "Parallelized neuron simulation program that will eventually \
               take advantage of a hardware accelerator to reduce simulation \
               time."

LICENSE = "CLOSED"

SECTION = "extra"
DEPENDS = "boost protobuf protobuf-native"

#SRCREV = "e98ee01cc2c684ce700827be4fbe8b0efa8a9933"
SRCREV = "ce5c6ff540b57b7be38707faf7ab82c0464d1f1d"

SRC_URI = "git://git@ada.csse.rose-hulman.edu/neuroprocessor-group/parallel-neuro-simulation.git;protocol=ssh;branch=19-change-cmake-configuration-to-work-with-bitbake"

SRC_URI[md5sum] = "057b883e556b7ed4785df5fb8f682"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native"
