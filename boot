= Kernels and Bootloaders =

The default kernels and bootloaders are not to be installed by debootstrap,
and *-minimal metapackages should not depend on them; however, they do need
to end up on CD images and in live filesystems. We therefore put them in a
separate seed.

== i386 ==

 * grub [amd64 i386]    # lilo will be in supported
 * linux-386 [i386]     # our chosen default install kernel, including restricted modules

== powerpc ==

 * yaboot [powerpc]        # ColinWatson
 * linux-powerpc [powerpc] # powerpc kernel, 32-bit machines
 * linux-powerpc64-smp [powerpc] # powerpc kernel, 64-bit machines

== amd64 ==

 * linux-amd64-generic [amd64] # amd64 kernel, works on all machines though not optimised

== ia64 ==

 * elilo [ia64]
 * linux-itanium-smp [ia64]    # ia64 kernel, works on all machines
 * linux-mckinley-smp [ia64]   # ia64 kernel, all Itanium II machines

== sparc ==

 * silo [sparc]
 * linux-sparc64 [sparc]       # sparc64 UP kernel, works on all machines

== hppa ==

 * palo [hppa]
 * linux-hppa32 [hppa]         # hppa32 UP kernel
 * linux-hppa64 [hppa]         # hppa64 UP kernel
