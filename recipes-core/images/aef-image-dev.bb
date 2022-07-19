include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append = " \
	jack \
	pure-data \
"

