// +build matcha,android

package bridge

/*
#cgo CFLAGS:
#cgo LDFLAGS: -landroid -llog

#include "matchaforeign.h"
#include "matchago.h"
#include "matchaforeign-java.h"
#include "matchago-java.h"
*/
import "C"
