SUMMARY = "Minimal image to test rukinia"
DESCRIPTION = "Recipe to create a minimal image to test rukinia"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " rukinia"