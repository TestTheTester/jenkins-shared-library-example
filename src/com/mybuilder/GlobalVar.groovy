#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.mybuilder.GlobalVar
   // println GlobalVars.foo
}
