= Kernels and Bootloaders =

The default kernels and bootloaders are not to be installed by debootstrap,
and *-minimal metapackages should not depend on them; however, they do need
to end up on CD images and in live filesystems. We therefore put them in a
separate seed.

We seed both linux-* and linux-image-* so that it's easier to build CD
images without the restricted component. The linux-* kernels include
restricted modules.

 * Kernel-Stem: linux linux-image

== i386 ==

 * grub [amd64 i386 lpia]                 # lilo will be in supported
 * grub-pc [amd64 i386 lpia]
 * ${Kernel-Stem}-generic [i386]          # our chosen default install kernel

== powerpc ==

 * yaboot [powerpc]
 * ${Kernel-Stem}-powerpc [powerpc]       # powerpc kernel, 32-bit machines
 * ${Kernel-Stem}-powerpc64-smp [powerpc] # powerpc kernel, 64-bit machines

== amd64 ==

 * ${Kernel-Stem}-generic [amd64]         # amd64 kernel, works on all machines though not optimised

== ia64 ==

 * elilo [i386 ia64]                      # also needed on Intel-based Macs
 * ${Kernel-Stem}-ia64 [ia64]             # ia64 kernel, works on all machines

== sparc ==

 * silo [sparc]
 * ${Kernel-Stem}-sparc64 [sparc]         # sparc64 UP kernel, works on all machines

== hppa ==

 * palo [hppa]
 * ${Kernel-Stem}-hppa32 [hppa]           # hppa32 UP kernel
 * ${Kernel-Stem}-hppa64 [hppa]           # hppa64 UP kernel

== lpia ==

 * ${Kernel-Stem}-lpia [lpia]             # lpia kernel, works on all machines

== armel ==

 * ${Kernel-Stem}-imx51 [armel]
 * ${Kernel-Stem}-dove [armel]
 * ${Kernel-Stem}-omap [armel]

== Germinate workarounds ==

Stop grub-common -> base-files -> awk from selecting mawk. (Since the boot seed doesn't inherit from required for arcane reasons, this is the only way we can make this work reliably ...)

 * mawk
